package com.t3h.smart;

import java.util.ArrayList;

public class SmartString {
    private String str = "\n" +
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<rss version=\"2.0\" xmlns:slash=\"http://purl.org/rss/1.0/modules/slash/\">\n" +
            "  <channel>\n" +
            "    <title>Thể thao - VnExpress RSS</title>\n" +
            "    <description>VnExpress RSS</description>\n" +
            "    <image>\n" +
            "      <url>https://s.vnecdn.net/vnexpress/i/v20/logos/vne_logo_rss.png</url>\n" +
            "      <title>Tin nhanh VnExpress - Đọc báo, tin tức online 24h</title>\n" +
            "      <link>https://vnexpress.net</link>\n" +
            "    </image>\n" +
            "    <pubDate>Thu, 30 May 2019 19:31:53 +0700</pubDate>\n" +
            "    <generator>VnExpress</generator>\n" +
            "    <link>https://vnexpress.net/rss/the-thao.rss</link>\n" +
            "    <item>\n" +
            "      <title>HLV Thái Lan: ‘Tôi hiểu rất rõ các cầu thủ Việt Nam’</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/hlv-thai-lan-toi-hieu-rat-ro-cac-cau-thu-viet-nam-3931436.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/a1-1559210366-5893-1559210397_180x108.png\" ></a></br>Ông Sirisak Yodyardthai vui mừng khi người đồng nghiệp Park Hang-seo gọi những gương mặt quen thuộc lên tuyển Việt Nam chuẩn bị cho King’s Cup 2019.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 18:02:00 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/hlv-thai-lan-toi-hieu-rat-ro-cac-cau-thu-viet-nam-3931436.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/hlv-thai-lan-toi-hieu-rat-ro-cac-cau-thu-viet-nam-3931436.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Liverpool chia tay Coutinho và 'Học thuyết Ewing'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/liverpool-chia-tay-coutinho-va-hoc-thuyet-ewing-3930868.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/865063624-0-1559121069-4542-1559121429_180x108.png\" ></a></br>Chia tay ngôi sao Brazil không làm Liverpool yếu đi, mà trái lại giúp họ mạnh mẽ hơn với hai lần vào chung kết châu Âu.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 13:00:00 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/liverpool-chia-tay-coutinho-va-hoc-thuyet-ewing-3930868.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/liverpool-chia-tay-coutinho-va-hoc-thuyet-ewing-3930868.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Nhất Long tự tin trước khi thượng đài với 'Thánh Muay Thái'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/nhat-long-tu-tin-truoc-khi-thuong-dai-voi-thanh-muay-thai-3930856.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/yilong-1559186307-6505-1559190303_180x108.jpg\" ></a></br>Cao thủ Thiếu Lâm đang ráo riết tập luyện để chuẩn bị cho lần thứ ba chạm trán với Buakaw Banchamek.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 11:39:45 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/nhat-long-tu-tin-truoc-khi-thuong-dai-voi-thanh-muay-thai-3930856.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/nhat-long-tu-tin-truoc-khi-thuong-dai-voi-thanh-muay-thai-3930856.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Kovacic giành Cup châu Âu bốn năm liên tiếp</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/kovacic-gianh-cup-chau-au-bon-nam-lien-tiep-3931347.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/kova-1559204358-2030-1559204382_180x108.jpg\" ></a></br>Mateo Kovacic là cầu thủ thành công nhất trong bốn mùa giải gần đây, nhờ những chiến tích trong màu áo Real Madrid và Chelsea.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 18:00:00 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/kovacic-gianh-cup-chau-au-bon-nam-lien-tiep-3931347.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/kovacic-gianh-cup-chau-au-bon-nam-lien-tiep-3931347.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Lãnh đạo Chelsea và Juventus gặp để thảo luận về Sarri</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/lanh-dao-chelsea-va-juventus-gap-de-thao-luan-ve-sarri-3931325.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/untitled-1559201634-5427-1559201669_180x108.png\" ></a></br>Một số cầu thủ Juventus tiết lộ rằng Maurizio Sarri sẽ là HLV của họ ở mùa tới.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 18:00:00 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/lanh-dao-chelsea-va-juventus-gap-de-thao-luan-ve-sarri-3931325.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/lanh-dao-chelsea-va-juventus-gap-de-thao-luan-ve-sarri-3931325.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Runner dự VnExpress Marathon sẽ nhận hàng loạt hỗ trợ trên đường chạy</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/runner-du-vnexpress-marathon-se-nhan-hang-loat-ho-tro-tren-duong-chay-3930730.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/top-1559186684-7768-1559186856_180x108.jpg\" ></a></br>Ban tổ chức bố trí nhiều tiện ích để giúp các VĐV làm mát và an toàn khi tranh tài tại Quy Nhơn ngày 9/6 tới. ]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 10:28:00 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/runner-du-vnexpress-marathon-se-nhan-hang-loat-ho-tro-tren-duong-chay-3930730.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/runner-du-vnexpress-marathon-se-nhan-hang-loat-ho-tro-tren-duong-chay-3930730.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Trung Quốc triệu tập cựu cầu thủ Arsenal</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/trung-quoc-trieu-tap-cuu-cau-thu-arsenal-3931453.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/5cb9204ba3104842e4a94dcb-jpeg-7837-2431-1559211728_180x108.png\" ></a></br>Nico Yennaris trở thành cầu thủ nhập tịch đầu tiên chơi cho đội tuyển quốc gia Trung Quốc.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 17:56:07 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/trung-quoc-trieu-tap-cuu-cau-thu-arsenal-3931453.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/trung-quoc-trieu-tap-cuu-cau-thu-arsenal-3931453.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Pedro hoàn tất bộ sưu tập danh hiệu vĩ đại</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/pedro-hoan-tat-bo-suu-tap-danh-hieu-vi-dai-3931380.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/pe-1559207146-1630-1559207174_180x108.jpg\" ></a></br>Sau trận chung kết Europa League, Pedro Rodriguez có mọi danh hiệu lớn nhất ở cấp CLB cũng như tuyển quốc gia.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 17:54:10 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/pedro-hoan-tat-bo-suu-tap-danh-hieu-vi-dai-3931380.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/pedro-hoan-tat-bo-suu-tap-danh-hieu-vi-dai-3931380.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Inter sa thải Spalletti, dọn đường đón Conte</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/inter-sa-thai-spalletti-don-duong-don-conte-3931458.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/107160996-ls2-1559212378-4409-1559212567_180x108.png\" ></a></br>Luciano Spalletti phải ra đi đúng như dự đoán dù giúp Inter giành vé dự Champions League mùa giải sau.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 17:50:37 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/inter-sa-thai-spalletti-don-duong-don-conte-3931458.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/inter-sa-thai-spalletti-don-duong-don-conte-3931458.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>CĐV ngưỡng mộ khoảnh khắc thủ môn Green nâng Europa League</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/cdv-nguong-mo-khoanh-khac-thu-mon-green-nang-europa-league-3931270.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/green2-1559193412-3587-1559193436_180x108.jpg\" ></a></br>Thủ môn của Chelsea hoan hỉ nâng Cup dù không được nhận huy chương.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 14:28:31 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/cdv-nguong-mo-khoanh-khac-thu-mon-green-nang-europa-league-3931270.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/cdv-nguong-mo-khoanh-khac-thu-mon-green-nang-europa-league-3931270.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Thanh Hoá - Nam Định: Đội khách tiếp tục gây địa chấn?</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/thanh-hoa-nam-dinh-doi-khach-tiep-tuc-gay-dia-chan-3931225.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/a1-1559188165-9959-1559188242_180x108.png\" ></a></br>Sau khi đánh bại Hà Nội, đội bóng thành Nam đang nuôi hy vọng thắng trận sân khách đầu tiên mùa này, ở vòng 12 V-League 2019 chiều 30/5.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 11:31:18 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/thanh-hoa-nam-dinh-doi-khach-tiep-tuc-gay-dia-chan-3931225.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/thanh-hoa-nam-dinh-doi-khach-tiep-tuc-gay-dia-chan-3931225.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Đà Nẵng - TP HCM: Xây chắc đỉnh bảng V-League</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/da-nang-tp-hcm-xay-chac-dinh-bang-v-league-3931192.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/DONG3394-1559186206-2145-1559186262_180x108.jpg\" ></a></br>CLB TP HCM sẽ kết thúc giai đoạn một ở vị trí cao nhất nếu chiến thắng trong chuyến làm khách đến Đà Nẵng, ở vòng 12 chiều 30/5.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 11:16:03 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/da-nang-tp-hcm-xay-chac-dinh-bang-v-league-3931192.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/da-nang-tp-hcm-xay-chac-dinh-bang-v-league-3931192.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Sarri tiết lộ về sự thay đổi giúp Chelsea hạ Arsenal</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/sarri-tiet-lo-ve-su-thay-doi-giup-chelsea-ha-arsenal-3931182.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/sari-1559186386-8946-1559186417_180x108.jpg\" ></a></br>HLV người Italy tiết lộ thay đổi trong giờ nghỉ giải lao, giúp đội bóng của ông chiến thắng 4-1 ở chung kết Europa League tối qua 29/5.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 10:51:24 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/sarri-tiet-lo-ve-su-thay-doi-giup-chelsea-ha-arsenal-3931182.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/sarri-tiet-lo-ve-su-thay-doi-giup-chelsea-ha-arsenal-3931182.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>HLV Emery: 'Chelsea có những cầu thủ biết khai thác sau lầm của Arsenal'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/hlv-emery-chelsea-co-nhung-cau-thu-biet-khai-thac-sau-lam-cua-arsenal-3931131.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/unai-1559184638-2174-1559184654_180x108.jpg\" ></a></br>Nhà cầm quân Tây Ban Nha tỏ ra mạnh mẽ dù thảm bại 1-4 trước Chelsea ở chung kết Europa League tối 29/5.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 10:44:32 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/hlv-emery-chelsea-co-nhung-cau-thu-biet-khai-thac-sau-lam-cua-arsenal-3931131.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/hlv-emery-chelsea-co-nhung-cau-thu-biet-khai-thac-sau-lam-cua-arsenal-3931131.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>15 phút bùng nổ giúp Chelsea vô địch Europa League</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/15-phut-bung-no-giup-chelsea-vo-dich-europa-league-3931127.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/9-1559183662-8446-1559183667_180x108.jpg\" ></a></br>Lép vế trong hiệp một, nhưng Hazard cùng đồng đội có cái kết viên mãn nhờ việc tăng tốc ngay đầu hiệp hai.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 09:45:59 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/15-phut-bung-no-giup-chelsea-vo-dich-europa-league-3931127.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/15-phut-bung-no-giup-chelsea-vo-dich-europa-league-3931127.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Sarri: 'Rất buồn vì Hazard chia tay Chelsea'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/sarri-rat-buon-vi-hazard-chia-tay-chelsea-3931092.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/sa-1559180482-1252-1559180514_180x108.jpg\" ></a></br>HLV của Chelsea chia sẻ về khả năng Eden Hazard đầu quân cho Real Madrid, sau trận chung kết Europa League hôm qua.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 08:52:54 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/sarri-rat-buon-vi-hazard-chia-tay-chelsea-3931092.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/sarri-rat-buon-vi-hazard-chia-tay-chelsea-3931092.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Griezmann tức giận vì không được chào đón ở Barca</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/griezmann-tuc-gian-vi-khong-duoc-chao-don-o-barca-3931016.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/untitled-1559160081-3685-1559160106_180x108.png\" ></a></br>Các ngôi sao sân Nou Camp phủ quyết ý định mua tiền đạo người Pháp của ban lãnh đạo.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 06:53:20 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/griezmann-tuc-gian-vi-khong-duoc-chao-don-o-barca-3931016.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/griezmann-tuc-gian-vi-khong-duoc-chao-don-o-barca-3931016.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Hazard: 'Vô địch Europa League là lời chia tay Chelsea'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/hazard-vo-dich-europa-league-la-loi-chia-tay-chelsea-3931022.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/untitled-1559166176-1984-1559166434_180x108.png\" ></a></br>Tiền vệ người Bỉ tuyên bố đã đến lúc tìm thử thách mới sau khi giúp Chelsea đánh bại Arsenal 4-1 trong trận chung kết hôm 29/5.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 06:38:40 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/hazard-vo-dich-europa-league-la-loi-chia-tay-chelsea-3931022.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/hazard-vo-dich-europa-league-la-loi-chia-tay-chelsea-3931022.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Fabregas đau lòng vì chung kết Europa League vắng khán giả</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/fabregas-dau-long-vi-chung-ket-europa-league-vang-khan-gia-3931020.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/untitled-1559165502-6469-1559165567_180x108.png\" ></a></br>Tiền vệ người Tây Ban Nha chỉ trích UEFA vì quyết định tổ chức trận đấu tại Baku khi chứng kiến hàng ngàn ghế bị bỏ trống.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 06:33:56 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/fabregas-dau-long-vi-chung-ket-europa-league-vang-khan-gia-3931020.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/fabregas-dau-long-vi-chung-ket-europa-league-vang-khan-gia-3931020.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Robbie Savage: 'Arsenal bị từ chối một quả phạt đền'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/robbie-savage-arsenal-bi-tu-choi-mot-qua-phat-den-3931019.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/untitled-1559164043-7323-1559164167_180x108.png\" ></a></br>Danh thủ Xứ Wales cho rằng trọng tài đáng ra phải thổi phạt khi Kepa đốn ngã Lacazette.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 06:32:06 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/robbie-savage-arsenal-bi-tu-choi-mot-qua-phat-den-3931019.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/robbie-savage-arsenal-bi-tu-choi-mot-qua-phat-den-3931019.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Chelsea thắng đậm Arsenal, vô địch Europa League</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/chelsea-thang-dam-arsenal-vo-dich-europa-league-3931007-tong-thuat.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/chelsea-r-1559167867-7882-1559168077_180x108.png\" ></a></br>Hazard ghi cú đúp giúp CLB vùng Tây London đại thắng 4-1 ở chung kết trên sân Baku Olympic, tối 29/5.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 01:00:00 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/chelsea-thang-dam-arsenal-vo-dich-europa-league-3931007-tong-thuat.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/chelsea-thang-dam-arsenal-vo-dich-europa-league-3931007-tong-thuat.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Giải bóng đá phong trào Hà Nội cắt giảm cầu thủ chuyên nghiệp</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/giai-bong-da-phong-trao-ha-noi-cat-giam-cau-thu-chuyen-nghiep-3931116.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/30/a1-1559181480-6156-1559181520_180x108.png\" ></a></br>Mỗi đội bóng dự giải giải hạng Nhất – Cup Vietfootball mùa thứ bốn (HL1-S4) chỉ được đăng ký năm cầu thủ từng thi đấu chuyên nghiệp ở Việt Nam.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 10:28:19 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/giai-bong-da-phong-trao-ha-noi-cat-giam-cau-thu-chuyen-nghiep-3931116.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/giai-bong-da-phong-trao-ha-noi-cat-giam-cau-thu-chuyen-nghiep-3931116.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Barca và PSG thảo luận việc đổi Dembele lấy Neymar</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/barca-va-psg-thao-luan-viec-doi-dembele-lay-neymar-3930790.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/neymar-1559117317-6087-1559117349_180x108.jpg\" ></a></br>Hai CLB kình địch trên thị trường chuyển nhượng đang ngồi lại với nhau để bàn giải pháp đổi tiền đạo.]]></description>\n" +
            "      <pubDate>Thu, 30 May 2019 04:00:00 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/barca-va-psg-thao-luan-viec-doi-dembele-lay-neymar-3930790.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/barca-va-psg-thao-luan-viec-doi-dembele-lay-neymar-3930790.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Federer nhẹ nhàng vào vòng ba Roland Garros 2019</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/federer-nhe-nhang-vao-vong-ba-roland-garros-2019-3931010.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/top-1559147611-3314-1559147616_180x108.jpg\" ></a></br>\"Tàu tốc hành\" thắng Oscar Otte 6-4, 6-3, 6-4 sau một giờ 36 phút, tại vòng hai giải Grand Slam đất nện hôm 29/5.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 23:34:59 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/federer-nhe-nhang-vao-vong-ba-roland-garros-2019-3931010.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/federer-nhe-nhang-vao-vong-ba-roland-garros-2019-3931010.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Nadal thẳng tiến vào vòng ba Roland Garros 2019</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/nadal-thang-tien-vao-vong-ba-roland-garros-2019-3930985.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/ScreenShot20190529at92317PM-15-9870-2476-1559139876_180x108.png\" ></a></br>Tay vợt Tây Ban Nha vượt qua Yannick Maden với tỷ số áp đảo 6-1, 6-2, 6-4, chiều 29/5.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 21:26:14 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/nadal-thang-tien-vao-vong-ba-roland-garros-2019-3930985.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/nadal-thang-tien-vao-vong-ba-roland-garros-2019-3930985.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Văn Lâm giữ sạch lưới, Muangthong thắng trở lại ở Thai League</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/van-lam-giu-sach-luoi-muangthong-thang-tro-lai-o-thai-league-3930981.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/truc-tiep-muangthong-vs-sukhot-5447-1769-1559138728_180x108.png\" ></a></br>Đội bóng của Văn Lâm giành chiến thắng 2-0 trước Sukhothai vòng 13 Thai League, tối 29/5.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 21:06:19 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/van-lam-giu-sach-luoi-muangthong-thang-tro-lai-o-thai-league-3930981.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/van-lam-giu-sach-luoi-muangthong-thang-tro-lai-o-thai-league-3930981.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Xuân Trường rời sân sớm, Buriram thua phút bù giờ</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/xuan-truong-roi-san-som-buriram-thua-phut-bu-gio-3930977.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/61866321-2208861592567104-5402-6196-7471-1559136698_180x108.png\" ></a></br>Đội bóng của Xuân Trường để thua 1-2 khi làm khách trên sân Chainat vòng 13 Thai League, tối 29/5.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 20:32:42 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/xuan-truong-roi-san-som-buriram-thua-phut-bu-gio-3930977.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/xuan-truong-roi-san-som-buriram-thua-phut-bu-gio-3930977.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Đinh Hạo thách Từ Hiểu Đông tái đấu</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/dinh-hao-thach-tu-hieu-dong-tai-dau-3930734.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/t01def75f1a1974c3a1-1559110722-2989-1559111376_180x108.jpg\" ></a></br>Cao thủ Vịnh Xuân chưa quên thất bại cách đây một năm và nuôi mộng báo thù võ sĩ MMA.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 14:42:12 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/dinh-hao-thach-tu-hieu-dong-tai-dau-3930734.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/dinh-hao-thach-tu-hieu-dong-tai-dau-3930734.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Barca giữ Valverde thêm một mùa</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/barca-giu-valverde-them-mot-mua-3930975.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/barca-la-con-tin-cua-bartomeu-4138-3230-1559135123_180x108.png\" ></a></br>Nhà cầm quân 55 tuổi được Chủ tịch Bartomeu và đội trưởng Messi ủng hộ ở lại sân Nou Camp.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 21:27:34 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/barca-giu-valverde-them-mot-mua-3930975.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/barca-giu-valverde-them-mot-mua-3930975.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Klopp: 'Đây là đội dự chung kết Champions League mạnh nhất của tôi'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/klopp-day-la-doi-du-chung-ket-champions-league-manh-nhat-cua-toi-3930512.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/skysportsjurgenklopptrentalexa-9105-7015-1559087883_180x108.jpg\" ></a></br>HLV người Đức tự tin vào chất lượng đội hình của Liverpool, trước cuộc quyết đấu với Tottenham ngày 1/6.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 16:21:06 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/klopp-day-la-doi-du-chung-ket-champions-league-manh-nhat-cua-toi-3930512.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/klopp-day-la-doi-du-chung-ket-champions-league-manh-nhat-cua-toi-3930512.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Hàn Phi Long - niềm hy vọng mới của võ truyền thống Trung Quốc</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/han-phi-long-niem-hy-vong-moi-cua-vo-truyen-thong-trung-quoc-3930164.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/2c1f73d2eb4a4221bbdf4b2640c576-8148-1848-1559026819_180x108.jpg\" ></a></br>Cao thủ Thái Cực từng bước vượt qua đàn anh Nhất Long, để trở thành võ sĩ được chú ý nhất tại Trung Quốc.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 09:57:38 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/han-phi-long-niem-hy-vong-moi-cua-vo-truyen-thong-trung-quoc-3930164.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/han-phi-long-niem-hy-vong-moi-cua-vo-truyen-thong-trung-quoc-3930164.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Barack Obama: 'Messi cũng không thể tự mình đạt đến thành công'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/barack-obama-messi-cung-khong-the-tu-minh-dat-den-thanh-cong-3930847.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/oba-1559121199-4186-1559121342_180x108.jpg\" ></a></br>Cựu tổng thống Mỹ dùng Lionel Messi như một ví dụ để nâng cao tinh thần đồng đội và làm việc tập thể.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 16:42:46 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/barack-obama-messi-cung-khong-the-tu-minh-dat-den-thanh-cong-3930847.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/barack-obama-messi-cung-khong-the-tu-minh-dat-den-thanh-cong-3930847.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Xavi khởi nghiệp HLV</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/xavi-khoi-nghiep-hlv-3930528.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/xa-1559091564-3046-1559091579_180x108.jpg\" ></a></br>Cựu tiền vệ Xavi sẽ dẫn dắt CLB mà anh vừa chia tay sự nghiệp cầu thủ, Al-Sadd (Qatar).]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 10:35:03 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/xavi-khoi-nghiep-hlv-3930528.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/xavi-khoi-nghiep-hlv-3930528.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Lloris: 'Tottenham cần vô địch để ghi dấu vào lịch sử Champions League'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/lloris-tottenham-can-vo-dich-de-ghi-dau-vao-lich-su-champions-league-3930477.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/GettyImages1141540743696x464-1-9203-2333-1559057921_180x108.jpg\" ></a></br>Đội trưởng Tottenham thổ lộ khao khát lần đầu vô địch giải đấu danh giá nhất cấp CLB châu Âu.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 06:37:22 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/lloris-tottenham-can-vo-dich-de-ghi-dau-vao-lich-su-champions-league-3930477.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/lloris-tottenham-can-vo-dich-de-ghi-dau-vao-lich-su-champions-league-3930477.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>HLV Gattuso chia tay AC Milan</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/hlv-gattuso-chia-tay-ac-milan-3930498.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/gattuso-1559063206-6257-1559063289_180x108.png\" ></a></br>CLB chủ sân San Siro thông báo chấm dứt hợp đồng với nhà cầm quân 41 tuổi, hôm 28/5.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 06:01:07 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/hlv-gattuso-chia-tay-ac-milan-3930498.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/hlv-gattuso-chia-tay-ac-milan-3930498.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Klopp: 'Lâu rồi Guardiola chưa vào chung kết Champions League'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/klopp-lau-roi-guardiola-chua-vao-chung-ket-champions-league-3930471.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/1LiverpoolvsWolverhamptonWande-7216-5166-1559054891_180x108.jpg\" ></a></br>HLV Liverpool buông lời châm chọc, sau khi đồng nghiệp nói đoạt cú ăn ba quốc nội khó hơn vô địch Champions League.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 05:59:02 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/klopp-lau-roi-guardiola-chua-vao-chung-ket-champions-league-3930471.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/klopp-lau-roi-guardiola-chua-vao-chung-ket-champions-league-3930471.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Emery: 'Arsenal muốn vô địch Europa League để vào top 10 thế giới'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/emery-arsenal-muon-vo-dich-europa-league-de-vao-top-10-the-gioi-3930947.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/top-1559140220-9528-1559140277_180x108.jpg\" ></a></br>HLV Arsenal coi trọng trận chung kết hôm nay và xem đó là nền tảng để \"Pháo thủ\" hướng đến những tham vọng to lớn hơn.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 21:31:17 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/emery-arsenal-muon-vo-dich-europa-league-de-vao-top-10-the-gioi-3930947.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/emery-arsenal-muon-vo-dich-europa-league-de-vao-top-10-the-gioi-3930947.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Petr Cech: 'Thi đấu cho Arsenal ít áp lực hơn Chelsea'</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/petr-cech-thi-dau-cho-arsenal-it-ap-luc-hon-chelsea-3930763.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/cech-1559113978-3877-1559114013_180x108.png\" ></a></br>Thủ thành 37 tuổi cho rằng Arsenal có thể thắng khi họ cần, trước thềm chung kết Europa League.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 14:21:21 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/petr-cech-thi-dau-cho-arsenal-it-ap-luc-hon-chelsea-3930763.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/petr-cech-thi-dau-cho-arsenal-it-ap-luc-hon-chelsea-3930763.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Sarri lo Hazard thiếu động lực ở chung kết Europa League</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/sarri-lo-hazard-thieu-dong-luc-o-chung-ket-europa-league-3930749.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/untitled-1559111399-4164-1559111590_180x108.png\" ></a></br>HLV Chelsea nhận thấy ngôi sao người Bỉ có vẻ chán nản trong các buổi tập trước trận đấu Arsenal.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 14:15:33 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/sarri-lo-hazard-thieu-dong-luc-o-chung-ket-europa-league-3930749.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/sarri-lo-hazard-thieu-dong-luc-o-chung-ket-europa-league-3930749.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Chelsea - Arsenal: Derby London ở chung kết Europa League</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/infographics/chelsea-arsenal-derby-london-o-chung-ket-europa-league-3930732.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/chelsea-arsenal-derby-london-o-chung-ket-europa-league-1559112308_180x108.jpg\" ></a></br>Chelsea cần danh hiệu để không trắng tay, còn Arsenal phải chiến thắng vì tấm vé dự Champions League mùa sau.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 14:09:14 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/infographics/chelsea-arsenal-derby-london-o-chung-ket-europa-league-3930732.html</link>\n" +
            "      <guid>https://vnexpress.net/infographics/chelsea-arsenal-derby-london-o-chung-ket-europa-league-3930732.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Italy sửa luật thuế để thu hút thêm siêu sao bóng đá</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/italy-sua-luat-thue-de-thu-hut-them-sieu-sao-bong-da-3930724.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/rona-1559105806-7291-1559105845_180x108.jpg\" ></a></br>Cầu thủ giỏi nước ngoài có thể sẽ lũ lượt kéo đến Italy để hưởng ưu đãi thuế tới hàng chục phần trăm.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 13:49:13 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/italy-sua-luat-thue-de-thu-hut-them-sieu-sao-bong-da-3930724.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/italy-sua-luat-thue-de-thu-hut-them-sieu-sao-bong-da-3930724.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Chelsea - Arsenal và hy vọng cho kỷ nguyên mới</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/chelsea-arsenal-va-hy-vong-cho-ky-nguyen-moi-3930713.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/httpsspecialsimagesforbesimgco-6167-8540-1559104802_180x108.png\" ></a></br>Hai đội bóng thành London cùng hướng tới danh hiệu Europa League như tiền đề cho một cuộc chuyển mình.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 12:24:33 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/chelsea-arsenal-va-hy-vong-cho-ky-nguyen-moi-3930713.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/chelsea-arsenal-va-hy-vong-cho-ky-nguyen-moi-3930713.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Sarri bỏ buổi tập sau khi cãi nhau với cầu thủ Chelsea</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/sarri-bo-buoi-tap-sau-khi-cai-nhau-voi-cau-thu-chelsea-3930520.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/top-1559090184-7943-1559090231_180x108.jpg\" ></a></br>Căng thẳng khiến Pedro, Higuain rồi HLV Sarri đều rời sân trong buổi tập làm quen với sân đấu chung kết Europa League tại Baku, Azerbaijan.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 07:32:03 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/sarri-bo-buoi-tap-sau-khi-cai-nhau-voi-cau-thu-chelsea-3930520.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/sarri-bo-buoi-tap-sau-khi-cai-nhau-voi-cau-thu-chelsea-3930520.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Na\u200Bomi Osaka thoát hiểm tại vòng một Roland Garros 2019</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/na-omi-osaka-thoat-hiem-tai-vong-mot-roland-garros-2019-3930509.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/29/screenshot20190529at60316am-15-6583-9082-1559084701_180x108.png\" ></a></br>Tay vợt nữ số một thế giới ngược dòng hạ Anna Karolina Schmiedlova 0-6, 7-6, 6-1 tại trận ra quân giải Grand Slam đất nện.]]></description>\n" +
            "      <pubDate>Wed, 29 May 2019 03:05:41 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/na-omi-osaka-thoat-hiem-tai-vong-mot-roland-garros-2019-3930509.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/na-omi-osaka-thoat-hiem-tai-vong-mot-roland-garros-2019-3930509.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Công Phượng vắng mặt trong chiến thắng của Incheon</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/cong-phuong-vang-mat-trong-chien-thang-cua-incheon-3930484.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/congphuong-1559056388-15590564-5112-9806-1559056509_180x108.png\" ></a></br>Tiền đạo tuyển Việt Nam không được đăng ký thi đấu khi Incheon thắng 2-1 trên sân Jeju, tối 28/5.]]></description>\n" +
            "      <pubDate>Tue, 28 May 2019 22:28:24 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/cong-phuong-vang-mat-trong-chien-thang-cua-incheon-3930484.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/cong-phuong-vang-mat-trong-chien-thang-cua-incheon-3930484.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Barca chuẩn bị sa thải Valverde</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/barca-chuan-bi-sa-thai-valverde-3930451.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/0LiverpoolvBarcelonaUEFAChampi-1391-9561-1559047937_180x108.jpg\" ></a></br>HLV người Tây Ban Nha trả giá sau khi mất vé dự chung kết Champions League.]]></description>\n" +
            "      <pubDate>Tue, 28 May 2019 21:02:09 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/barca-chuan-bi-sa-thai-valverde-3930451.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/barca-chuan-bi-sa-thai-valverde-3930451.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Thông điệp nào của Park Hang-seo qua danh sách dự King's Cup?</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/thong-diep-nao-cua-park-hang-seo-qua-danh-sach-du-king-s-cup-3930234.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/top-1559028356-9940-1559028363_180x108.jpg\" ></a></br>HLV tuyển Việt Nam bất ngờ gọi lại Anh Đức - tiền đạo đã giã từ đội tuyển, và nhiều cái tên đang không có phong độ cao nhất. ]]></description>\n" +
            "      <pubDate>Tue, 28 May 2019 16:17:09 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/thong-diep-nao-cua-park-hang-seo-qua-danh-sach-du-king-s-cup-3930234.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/thong-diep-nao-cua-park-hang-seo-qua-danh-sach-du-king-s-cup-3930234.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>HLV Park Hang-seo gọi cầu thủ Việt kiều vào U23 Việt Nam</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/hlv-park-hang-seo-goi-cau-thu-viet-kieu-vao-u23-viet-nam-3930163.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/martinlo-1559018199-1559018216-8934-1559018220_180x108.png\" ></a></br>Martin Lo là một trong 30 cầu thủ được triệu tập chuẩn bị cho trận giao hữu với U23 Myanmar.]]></description>\n" +
            "      <pubDate>Tue, 28 May 2019 11:35:01 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/hlv-park-hang-seo-goi-cau-thu-viet-kieu-vao-u23-viet-nam-3930163.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/hlv-park-hang-seo-goi-cau-thu-viet-kieu-vao-u23-viet-nam-3930163.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Perez từ chối để Ramos đến Trung Quốc theo dạng miễn phí</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/bong-da/perez-tu-choi-de-ramos-den-trung-quoc-theo-dang-mien-phi-3930074.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/28/untitled-1559012432-2978-1559012478_180x108.png\" ></a></br>Chủ tịch Real tiết lộ đội trưởng của CLB đã đề xuất được tự do ra đi trong hè năm nay.]]></description>\n" +
            "      <pubDate>Tue, 28 May 2019 10:22:10 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/bong-da/perez-tu-choi-de-ramos-den-trung-quoc-theo-dang-mien-phi-3930074.html</link>\n" +
            "      <guid>https://vnexpress.net/bong-da/perez-tu-choi-de-ramos-den-trung-quoc-theo-dang-mien-phi-3930074.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "    <item>\n" +
            "      <title>Yannick Hanfmann 0-3 Rafael Nadal</title>\n" +
            "      <description><![CDATA[<a href=\"https://vnexpress.net/the-thao/yannick-hanfmann-0-3-rafael-nadal-3929894.html\"><img width=130 height=100 src=\"https://i-thethao.vnecdn.net/2019/05/27/rafaelnadal061947-1558964694-1366-1558964698_180x108.jpg\" ></a></br>Tay vợt người Tây Ban Nha khởi đầu thuận lợi ở Roland Garros 2019 bằng chiến thắng 6-2, 6-1, 6-3.]]></description>\n" +
            "      <pubDate>Tue, 28 May 2019 00:34:47 +0700</pubDate>\n" +
            "      <link>https://vnexpress.net/the-thao/yannick-hanfmann-0-3-rafael-nadal-3929894.html</link>\n" +
            "      <guid>https://vnexpress.net/the-thao/yannick-hanfmann-0-3-rafael-nadal-3929894.html</guid>\n" +
            "      <slash:comments>0</slash:comments>\n" +
            "    </item>\n" +
            "  </channel>\n" +
            "</rss>\n";

    public ArrayList<News> filter(){
        ArrayList<News> arr = new ArrayList<>();
        try {
            String [] part = str.split("</item>");
            for (String s: part){
                int index = s.indexOf("<item>");
                s = s.substring(index);
                String title = "<title>";
                index = s.indexOf(title) + title.length();
                int endIndex = s.indexOf("</title>");
                title = s.substring(index, endIndex);

                String date = "<pubDate>";
                index = s.indexOf(date) + date.length();
                endIndex = s.indexOf("</pubDate>");
                date = s.substring(index, endIndex);

                String link = "<link>";
                index = s.indexOf(link) + link.length();
                endIndex = s.indexOf("</link>");
                link = s.substring(index, endIndex);

                String src = "src=\"";
                index = s.indexOf(src) + src.length();
                s = s.substring(index);
                endIndex = s.indexOf("\"");
                String img = s.substring(0, endIndex);
                News news = new News(title, link, img, date);
                arr.add(news);
            }
        }catch (Exception ex){

        }
        return arr;
    }

}
