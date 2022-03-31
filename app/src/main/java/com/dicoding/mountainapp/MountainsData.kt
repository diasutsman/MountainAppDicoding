package com.dicoding.mountainapp

object MountainsData {
    private val mountainNames = arrayOf(
        "Gunung Bromo",
        "Gunung Semeru",
        "Gunung Prau",
        "Gunung Rinjani",
        "Gunung Ijen",
        "Gunung Kelimutu",
        "Gunung Patuha",
        "Gunung Kerinci",
        "Gunung Cartensz",
        "Gunung Gede"
    )
    private val mountainImages = arrayOf(
        R.drawable.bromo,
        R.drawable.semeru,
        R.drawable.prau,
        R.drawable.rinjani,
        R.drawable.ijen,
        R.drawable.kelimutu,
        R.drawable.patuha,
        R.drawable.kerinci,
        R.drawable.cartensz,
        R.drawable.gede
    )

    private val mountainDetails = arrayOf(
        """Gunung Bromo (dari bahasa Sanskerta: Brahma, salah seorang Dewa Utama dalam agama Hindu) atau dalam bahasa Tengger dieja "Brama", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.

Bentuk tubuh Gunung Bromo bertautan antara lembah dan ngarai dengan kaldera atau lautan pasir seluas sekitar 10 kilometer persegi. Ia mempunyai sebuah kawah dengan garis tengah ± 800 meter (utara-selatan) dan ± 600 meter (timur-barat). Sedangkan daerah bahayanya berupa lingkaran dengan jari-jari 4 km dari pusat kawah Bromo.""",
        """Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung ini terbentuk akibat Subduksi Lempeng Indo-Australia kebawah Lempeng Eurasia. Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat.[2] Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.

Semeru mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung.

Posisi geografis Semeru terletak antara 8°06' LS dan 112°55' BT.

Pada tahun 1913 dan 1946 Kawah Jonggring Saloka memiliki kubah dengan ketinggian 3.744,8 m hingga akhir November 1973. Di sebelah selatan, kubah ini mendobrak tepi kawah menyebabkan aliran lava mengarah ke sisi selatan meliputi daerah Pronojiwo dan Candipuro di Lumajang.""",
        """Gunung Prau (2.590 mdpl) terletak di kawasan Dataran Tinggi Dieng, Jawa Tengah, Indonesia. Gunung Prau terletak pada koordinat 7°11′13″S 109°55′22″E. Gunung Prau merupakan tapal batas antara empat kabupaten yaitu Kabupaten Batang, Kabupaten Kendal, Kabupaten Temanggung dan Kabupaten Wonosobo.

Puncak Gunung Prau merupakan padang rumput luas yang memanjang dari barat ke timur. Bukit-bukit kecil dan sabana dengan sedikit pepohonan dapat kita jumpai di puncak. Gunung Prau merupakan puncak tertinggi di kawasan Dataran Tinggi Dieng, dengan beberapa puncak yang lebih rendah di sekitarnya, antara lain Gunung Sipandu, Gunung Pangamun-amun, dan Gunung Juranggrawah.

Gunung ini sekarang menjadi salah satu tujuan wisata utama pada kawasan wisata Dieng sebagai wisata alam.""",
        """Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 mdpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya. Gunung ini merupakan bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan penambahannya sehingga menjadi 76.000 ha ke arah barat dan timur.

Secara administratif gunung ini berada dalam wilayah tiga kabupaten: Lombok Timur, Lombok Tengah, dan Lombok Barat.""",
        """Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.386 mdpl dan terletak berdampingan dengan Gunung Merapi. Gunung Ijen terakhir meletus pada tahun 1999. Salah satu fenomena alam yang paling terkenal dari Gunung Ijen adalah blue fire (api biru) di dalam kawah yang terletak di puncak gunung tersebut. Pendakian gunung ini bisa dimulai dari dua tempat, yakni dari Banyuwangi atau dari Bondowoso.""",
        """Gunung Kelimutu adalah gunung berapi yang terletak di Pulau Flores, Provinsi NTT, Indonesia. Lokasi gunung ini tepatnya di Desa Pemo, Kecamatan Kelimutu, Kabupaten Ende. Gunung ini memiliki tiga buah danau Diarsipkan 2017-03-04 di Wayback Machine. kawah di puncaknya. Danau ini dikenal dengan nama Danau Tiga Warna karena memiliki tiga warna yang berbeda, yaitu merah, biru, dan putih. Walaupun begitu, warna-warna tersebut selalu berubah-ubah seiring dengan perjalanan waktu.

Kelimutu merupakan gabungan kata dari "keli" yang berarti gunung dan kata "mutu" yang berarti mendidih. Menurut kepercayaan penduduk setempat, warna-warna pada danau Kelimutu memiliki arti masing-masing dan memiliki kekuatan alam yang sangat dahsyat.

Danau atau Tiwu Kelimutu di bagi atas tiga bagian yang sesuai dengan warna - warna yang ada di dalam danau. Danau berwarna biru atau "Tiwu Nuwa Muri Koo Fai" merupakan tempat berkumpulnya jiwa-jiwa muda-mudi yang telah meninggal. Danau yang berwarna merah atau "Tiwu Ata Polo" merupakan tempat berkumpulnya jiwa-jiwa orang yang telah meninggal dan selama ia hidup selalu melakukan kejahatan/tenung. Sedangkan danau berwarna putih atau "Tiwu Ata Mbupu" merupakan tempat berkumpulnya jiwa-jiwa orang tua yang telah meninggal.

Para penduduk di sekitar Danau Kelimutu percaya, bahwa pada saat danau berubah warna, mereka harus memberikan sesajen bagi arwah orang - orang yang telah meninggal.

Luas ketiga danau itu sekitar 1.051.000 meter persegi dengan volume air 1.292 juta meter kubik. Batas antar danau adalah dinding batu sempit yang mudah longsor. Dinding ini sangat terjal dengan sudut kemiringan 70 derajat. Ketinggian dinding danau berkisar antara 50 sampai 150 meter.""",
        """Gunung Patuha merupakan sebuah gunung yang terdapat di Rancabali, Ciwidey, Kabupaten Bandung, Jawa Barat yang memiliki ketinggian 2.434 meter.[2] Gunung Patuha memiliki kawah yang sangat eksotik, yaitu kawah putih. Kawah yang terbentuk dari letusan gunung patuha itu memiliki dinding kawah dan air yang berwarna putih.

Gunung Patuha mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung.""",
        """Gunung Kerinci (juga dieja "Kerintji", dan dikenal sebagai Gunung Gadang, Berapi Kurinci, Kerinchi, Korinci, atau Puncak Indrapura) adalah gunung tertinggi di Sumatra, gunung berapi tertinggi di Indonesia, dan puncak tertinggi di Indonesia di luar Papua. Gunung Kerinci terletak tepat di perbatasan antara Provinsi Sumatera Barat dengan Provinsi Jambi, di Pegunungan Bukit Barisan, dekat pantai barat, dan terletak sekitar 130 km sebelah selatan Padang Provinsi Sumatra Barat. Gunung ini juga menjadi batas antara wilayah Etnis Minangkabau dengan Suku Kerinci yang dikelilingi hutan lebat Taman Nasional Kerinci Seblat dan merupakan habitat harimau sumatra dan badak sumatra.[1]

Puncak Gunung Kerinci berada pada ketinggian 3.805 mdpl, di Kabupaten Kerinci, Provinsi Jambi, di sini pengunjung dapat melihat di kejauhan membentang pemandangan indah Kota Jambi, Padang, dan Bengkulu. Bahkan Samudera Hindia yang luas dapat terlihat dengan jelas. Gunung Kerinci memiliki kawah seluas 400 x 120 meter dan berisi air yang berwarna hijau. Di sebelah timur terdapat danau Bento, rawa berair jernih tertinggi di Sumatra. Di belakangnya terdapat gunung tujuh dengan kawah yang hampir tak tersentuh.

Gunung Kerinci merupakan gunung berapi bertipe stratovulcano yang masih aktif dan terakhir kali meletus pada tahun 2009.""",
        """Gunung Cartenz adalah sebuah gunung yang terletak di Papua, Indonesia. Gunung ini memiliki tinggi setinggi 4.884 meter di atas permukaan laut yang diselimuti salju abadi. Puncak gunung ini disebut "Piramida Cartenz", dan juga Puncak Jaya, yang merupakan dataran tertinggi di Indonesia. Gunung ini adalah salah satu dari tujuh gunung yang dikenal sebagai Tujuh Puncak Dunia.""",
        """Gunung Gede merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980. Gunung ini berada di dua wilayah kabupaten yaitu Kabupaten Cianjur dan Sukabumi, dengan ketinggian 1.000 - 2.958 m. dpl, dan berada pada lintang 106°51' - 107°02' BT dan 64°1' - 65°1 LS. Suhu rata-rata di puncak gunung Gede 18 °C dan di malam hari suhu puncak berkisar 5 °C, dengan curah hujan rata-rata 3.600 mm/tahun. Gerbang utama menuju gunung ini adalah dari Cibodas dan Cipanas.

Litografi tahun 1828 oleh A. J. Bik yang menggambarkan Gunung Gede
Gunung Gede diselimuti oleh hutan pegunungan, yang mencakup zona-zona submontana, montana, hingga ke subalpin di sekitar puncaknya. Hutan pegunungan di kawasan ini merupakan salah satu yang paling kaya jenis flora di Indonesia, bahkan di kawasan Malesia."""
    )

    val listData: ArrayList<Mountain>
        get() {
            val list = arrayListOf<Mountain>()
            for (i in mountainNames.indices) {
                list.add(
                    Mountain(
                        name = mountainNames[i],
                        img = mountainImages[i],
                        detail = mountainDetails[i]
                    )
                )
            }
            return list
        }

}