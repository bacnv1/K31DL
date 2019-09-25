package com.t3h.qldanhba.data;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.util.Log;

import com.t3h.qldanhba.models.Contact;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class SystemData {
    private ContentResolver resolver;

    public SystemData(Context context) {
        resolver = context.getContentResolver();
    }

    public ArrayList<Contact> getContact() {
        ArrayList<Contact> arr = new ArrayList<>();
        String where = ContactsContract.Data.DATA_VERSION + " = ?";
        String[] whereAgr = {"0"};
        Cursor c = resolver.query(
                ContactsContract.Data.CONTENT_URI,
                null,
                where,
                whereAgr,
                null
        );
        c.moveToFirst();
        int indexId = c.getColumnIndex(ContactsContract.Data.CONTACT_ID);
        int indexName = c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
        int indexAvatar = c.getColumnIndex(ContactsContract.Contacts.PHOTO_URI);
        int indexPhone = c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DATA);
        while (c.isAfterLast() == false) {
            int id = c.getInt(indexId);
            String name = c.getString(indexName);
            String avatar = c.getString(indexAvatar);
            String phone = c.getString(indexPhone);
            Contact contact = new Contact();
            contact.setId(id);
            contact.setAvatar(avatar);
            contact.setName(name);
            contact.setPhone(phone);
            arr.add(contact);
            c.moveToNext();
        }
        return arr;
    }

    public void update(Contact contact)
    {
        ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>();

        // Name
        ContentProviderOperation.Builder builder = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
        builder.withSelection(ContactsContract.Data.CONTACT_ID + "=?" + " AND " + ContactsContract.Data.MIMETYPE + "=?", new String[]{String.valueOf(contact.getId()), ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE});
        builder.withValue(ContactsContract.CommonDataKinds.StructuredName.GIVEN_NAME, contact.getName());
        ops.add(builder.build());

        // Number
        builder = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
        builder.withSelection(ContactsContract.Data.CONTACT_ID + "=?" + " AND " + ContactsContract.Data.MIMETYPE + "=?"+ " AND " + ContactsContract.CommonDataKinds.Organization.TYPE + "=?", new String[]{String.valueOf(contact.getId()), ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE, String.valueOf(ContactsContract.CommonDataKinds.Phone.TYPE_HOME)});
        builder.withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, contact.getPhone());
        ops.add(builder.build());


        // Picture
        try
        {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(resolver, Uri.parse(contact.getAvatar()));
            ByteArrayOutputStream image = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG , 10, image);

            builder = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI);
            builder.withSelection(ContactsContract.Data.CONTACT_ID + "=?" + " AND " + ContactsContract.Data.MIMETYPE + "=?", new String[]{String.valueOf(contact.getId()), ContactsContract.CommonDataKinds.Photo.CONTENT_ITEM_TYPE});
            builder.withValue(ContactsContract.CommonDataKinds.Photo.PHOTO, contact.getAvatar());
            ops.add(builder.build());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Update
        try
        {
            resolver.applyBatch(ContactsContract.AUTHORITY, ops);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
