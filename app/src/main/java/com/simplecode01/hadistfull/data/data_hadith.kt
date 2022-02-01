package com.simplecode01.hadistfull.data

import com.simplecode01.hadistfull.model.HadithBook

object data_hadith {
    val items = arrayOf<String>(
            "1,Akhlak_Rawi_Khatib,2220,Akhlak Rawi Khatib,https://www.sifatusafwa.com/17643-cart_default/al-jami-li-akhlaq-ar-rawi-al-khatib-al-baghdadi.jpg," ,
            "2,Al_Adabul_Mufrad,2013,Al-adabul Mufrad,https://almanshurohagency.com/wp-content/uploads/2019/10/terjemah-al-adab-al-mufrod.jpeg," ,
            "3,Arbain_Nawawi_I,42,Arbain Nawawi,https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1611107231/bkbyg7cqikqfadvwsyni.jpg," ,
            "4,Arbain_Nawawi_II,42,Arbain Nawawi,https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1611107231/bkbyg7cqikqfadvwsyni.jpg," ,
            "5,Aunul_Mabud,5307,Aunul Mabud,https://atsar.ilmusunnah.com/image/cache/data/Syarah_Hadis/Aunul_Ma'bud-320x320.jpg," ,
            "6,Bulughul_Maram,1597,Bulughul Maram,https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//1460/penerbit-jabal_penerbit-jabal-bulughul-maram-by-ibnu-hajar-al-asqalany-buku-agama_full04.jpg," ,
            "7,Bulughul_Maram_Arab,607,Bulughul Maram Arab,https://toko-muslim.com/images/product/2019/03/Kitab-Matan-Bulughul-Maram-Min-Adillatil-Ahkam-01.jpg," ,
            "8,Bulughul_Maram_Tahqiq_Fahl,1834,Bulughul maram Tahqiq Fahl,http://toko-muslim.com/images/product/bulughul-maram-kumpulan-hadits-hukum-fikih-islam-cover.jpg," ,
            "9,Doa_Thabarani,2478,Al-Mu'jam Ash-Shag'hir,https://cf.shopee.co.id/file/7d1965d1455542b82c43cbcbccdbce21," ,
            "10,Faidhul_Qadir,10128,Faidul Qadir,https://cf.shopee.co.id/file/324b61e3f05f9c769ab2e7b585be0440," ,
            "11,Fathul_Bari_Ibnu_Hajar,10164,Fathul Bari Ibnu Hajar,https://d28uhgd8q75f20.cloudfront.net/images/detailed/1/Fathul-bari-paket1-3d-rc.jpg?t=1603021577," ,
            "12,Hasyiatus_Sindi_Ibnu_Majah,3691,Sunan Ibnu Majah,https://s2.bukalapak.com/img/703004143/large/SUNAN_IBNU_MAJAH.jpg," ,
            "13,Hasyiatus_Sindi_Nasai,3240,Sunan an-Nasa'i,https://waifu2x.booru.pics/outfiles/26994889641d120467841b4e0f977db9fafc12ec_s2_n2.jpg," ,
            "14,Hilyatul_Aulia,16745,Hilyatul Auliya',https://1.bp.blogspot.com/-CyFCHOHPY-Y/Xpu7jCTXtdI/AAAAAAAADko/ziVOHLE5m2c9LAOPFBXrTrQ37KFH_iCegCLcBGAsYHQ/s1600/IMG_20200419_094443.jpg," ,
            "15,Majmauz_Zawaid,3485,Majma al-Zawa'id,https://alchetron.com/cdn/majma-al-zawaid-99c1bdf6-aef7-4ee9-b9d1-a86f7008793-resize-750.jpeg," ,
            "16,Mirqatul_Mafatih_Ali_Al_Qari,8767,Mirqatul Mafatih Syarah Misykatul Mashobih,https://s3.bukalapak.com/img/3076910328/large/Mirqatul_Mafatih_Syarah_Misykatul_Mashabih_11_Jilid.jpg," ,
            "17,Mujam_Thabarani_Awsath,3139,Mujam Thabrani Ausath,https://cf.shopee.co.id/file/7fb58a8a39cb16ba8e59b3ae6d806200_tn," ,
            "18,Mujam_Thabarani_Kabir,26840,Al Mu'jam Al Kabir,https://wisatabuku.com/wp-content/uploads/2018/05/Buku-Al-Mujam-Al-Kabir-Imam-At-Thabarani-Pustaka-Azzam.jpg," ,
            "19,Mujam_Thabarani_Shaghir,1198,Al Mu'jam Ash-Shaghir,https://waifu2x.booru.pics/outfiles/47a793c0b40d484840626ef542330eade73e99b2_s2_n2.jpg," ,
            "20,Mukhtashar_Qiyamullail_Marwazi,603,Mukhtashar qiyamullail,https://www.bukukita.com/babacms/displaybuku/76655_f.jpg," ,
            "21,Mushannaf_Abdurrazzaq,20977,Mushannaf Abdurrazzaq,https://s2.bukalapak.com/img/765039624/large/KITAB_MUSHANNAF_ABDURRAZZAQ_1_12_scaled.jpg," ,
            "22,Mushannaf_Ibnu_Abi_Syaibah,42755,Mushannaf Ibnu Abi Syaibah,https://ia801506.us.archive.org/33/items/mushannaf-ibnu-abi-syaibah/Mushannaf%20Ibnu%20Abi%20Syaibah.jpg," ,
            "23,Musnad_Abu_Yala,7644,Musnad Abi Yala,https://ia601505.us.archive.org/18/items/misnad-abi-yala/Misnad%20Abi%20Yala.PNG," ,
            "24,Musnad_Bazzar,9594,Musnad Bazzar,https://ia601402.us.archive.org/24/items/musnad-bazzar/Musnad%20Bazzar.jpg," ,
            "25,Musnad_Syafii,1800,Musnad Syafii,https://ia601402.us.archive.org/23/items/musnad-syafii/Musnad%20Syafii.jpg," ,
            "26,Mustadrak_Hakim,673,Al Mustadrak Al Hakim,https://ia801403.us.archive.org/16/items/al-mustadrak-imam/Al%20Mustadrak%20imam.PNG," ,
            "27,Mustadrak_Hakim_Arab,9444,Al Mustadrak Al Hakim Arab,https://ia801403.us.archive.org/16/items/al-mustadrak-imam/Al%20Mustadrak%20imam.PNG," ,
            "28,Penjelasan_Hadis_Pilihan,76,Penjelasan hadis pilihan,https://pusatbukusunnah.com/wp-content/uploads/2015/04/Syarah-hadist-Pilihan-Bukhari-Muslim-265x340.jpg," ,
            "29,Riyadhus_Shalihin,372,Riyadhus Shalihin,https://ia601505.us.archive.org/13/items/riyadhus-shalihin_202201/Riyadhus%20Shalihin.PNG," ,
            "30,Riyadhus_Shalihin_Arab,850,Riyadhus Shalihin Arab,https://ia601505.us.archive.org/13/items/riyadhus-shalihin_202201/Riyadhus%20Shalihin.PNG," ,
            "31,Shahih_Adabul_Mufrad_Terjemah,561,Shahih Adabul Mufrad Terjemah,https://ia601405.us.archive.org/8/items/shahih-adabul-mufrad/Shahih%20Adabul%20Mufrad.PNG," ,
            "32,Shahih_Ibnu_Hibban,2769,Shahih Ibnu Hibban,https://i.ibb.co/RhcCgns/Shahih-Ibnu-Hibban.jpg," ,
            "33,Shahih_Ibnu_Hibban_Arab,14940,Shahih Ibnu Hibba Arab,https://i.ibb.co/5sjhZKY/Shahih-Ibnu-Hibba-Arab.jpg," ,
            "34,Shahih_Ibnu_Khuzaimah,1808,Shahih Ibnu Khuzaimah,https://i.ibb.co/k3fy2BH/Shahih-Ibnu-Khuzaimah.jpg," ,
            "35,Shahih_Ibnu_Khuzaimah_Arab,1470,Shahih Ibnu Khuzaimah Arab,https://i.ibb.co/QPctn24/Shahih-Ibnu-Khuzaimah-Arab.jpg," ,
            "36,Silsilah_Shahihah_Albani,3094,Silsilah Hadits Shahih Syaikh Albani Arab,https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1344804919i/11486643._UY440_SS440_.jpg," ,
            "37,Silsilah_Shahihah_Terjemah,118,Silsilah Hadits Shahih Syaikh Albani,https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1344804919i/11486643._UY440_SS440_.jpgg," ,
            "38,Sunan_Baihaqi_Kabir,26668,Kitab Sunan al-Kubra Imam Baihaqi,https://images.tokopedia.net/img/cache/700/product-1/2020/2/8/batch-upload/batch-upload_8709f423-26a6-413f-a6fc-1c1c59739627.jpg," ,
            "39,Sunan_Baihaqi_Shaghir,4239,Kitab Sunan Ash Shaghir Imam Baihaqi,http://inlislite.uin-suska.ac.id/uploaded_files/sampul_koleksi/original/Monograf/9813.jpeg," ,
            "40,Sunan_Daraquthni,4790,Sunan al-Daraqutn,https://insantri.com/wp-content/uploads/2020/04/sunan-daruquthni.jpg," ,
            "41,Syarah_Arbain_Nawawi_Ibnu_Daqiq,42,Syarah Arbain Nawawi Ibnu Daqiq,https://i.ibb.co/ZzJ5Nq1/Syarah-Arbain-Nawawi-Ibnu-Daqiq.jpg," ,
            "42,Syarh_Shahih_Muslim_Nawawi,4410,Syarh Shahih Muslim Nawawi,https://darus-sunnah.com/wp-content/uploads/2019/11/37-2.jpeg," ,
            "43,Syuabul_Iman_Baihaqi,11323,Syuabul Iman,http://4.bp.blogspot.com/-3NX8fNG3Qyo/UWmbgp2V61I/AAAAAAAAAq0/bo5zltrsQ2o/s1600/syu'abul,iman.jpg," ,
            "44,Tamhid_Ibnu_Abdil_Barr,8244,Tamhid Ibnu Abdil Barr,https://ia601500.us.archive.org/8/items/tamhid-ibnu-abdil-barr/Tamhid%20Ibnu%20Abdil%20Barr.PNG," ,
            "45,Targhib_wat_Tarhib_Mundziri,1412,At-Targhib Wat-Tarhib Al-Mundziri,https://i.ibb.co/16HBwTX/At-Targhib-wat-Tarhib.jpg," ,
            "46,Tuhfatul_Ahwadzi,4874,Tuhfatul Ahwadzi,https://i.ibb.co/tzq97Zp/Tuhfatul-Ahwadzi.jpg")

        fun getHadithBook(): List<HadithBook>{
                val bookList = mutableListOf<HadithBook>()
                items.forEach {
                        val bookArray = it.split(",")
                        val id = bookArray[0].toInt()
                        val bookEndPoint = bookArray[1]
                        val count = bookArray[2].toInt()
                        val title = bookArray[3]
                        val imageCover = bookArray[4]
                        val book = HadithBook(id, title, count, imageCover, bookEndPoint)
                        bookList.add(book)
                }
                return bookList
        }
}