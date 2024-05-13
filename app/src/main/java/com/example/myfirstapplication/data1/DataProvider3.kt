package com.example.myfirstapplication.data1


import com.example.myfirstapplication.R

object DataProvider3 {
    val kemeja =
        kemeja(
            id = 1,
            title = "polyester",
            material = "Katun",
            description = "Jika kamu tahu, bahan polyester memang memiliki kekurangan bersifat panas dan kurang menyerap keringat. Maka dari itu bahan ini biasanya dikombinasikan dengan bahan katun agar lebih nyaman dipakai.",
            kemejaImageId = R.drawable.k1
        )

    val kemejaList = listOf(
        kemeja,
        kemeja(
            id = 2,
            title = "suede",
            material = "Katun",
            description = "Jenis bahan kain yang satu ini sama-sama terbuat dari kulit binatang. Berbeda dari material kulit yang terbuat dari kulit binatang bagian luar, suede justru terbuat dari kulit binatang bagian dalam yang lebih lembut dan fleksibel.",
            kemejaImageId = R.drawable.k2
        ),
        kemeja(
            id = 3,
            title = "Katun",
            material = "Male",

            description = "Nama kain yang satu ini pasti sudah tidak asing. Ya, kain yang terbuat dari serat kapas ini memang dikenal sebagai jenis kain yang paling nyaman di kulit dan mempunyai daya serap keringat yang baik",
            kemejaImageId = R.drawable.k3
        ),
        kemeja(
            id = 4,
            title = "Linen",
            material = "Male",

            description = "Terlihat menyerupai kain katun namun linen adalah bahan kain dengan kualitas terbaik dan mempunyai karakteristik istimewa. Kamu dapat dengan mudah membedakan linen karena serat yang terkandung di dalamnya.",
            kemejaImageId = R.drawable.k4
        ),
        kemeja(
            id = 5,
            title = "Denim",
            material = "Male",

            description = "Bahan kain yang satu ini tak perlu dipertanyakan lagi kualitasnya. Kain denim adalah salah satu dari macam macam kain yang terbuat dari serat yang sangat kuat, tebal namun mudah dicuci.",
            kemejaImageId = R.drawable.k5
        ),
        kemeja(
            id = 6,
            title = "Drill",
            material = "Male",

            description = "Tidak hanya linen, kain drill juga mempunyai wujud yang menyerupai bahan kain katun. Bedanya, kain drill lebih tebal dibanding katun atau linen. Bahan kain ini terbuat dari pencampuran serat tetoron dan rayon serta polyester.",
            kemejaImageId = R.drawable.k6
        ),
        kemeja(
            id = 7,
            title = "Baby canvas",
            material = "Male",

            description = "Apa yang terlintas di benakmu saat membaca kata “canvas”? Kain kasar yang digunakan untuk melukis dan pembuatan tote bag maupun sepatu? Ya, kain canvas memang terkesan kasar dan kaku namun hal sebaliknya dengan baby canvas.",
            kemejaImageId = R.drawable.k7
        ),
        kemeja(
            id = 8,
            title = "Material",
            material = "Male",

            description = "Bahan kain yang terbuat dari kulit memang populer dijadikan jaket. Tapi, kini juga banyak lho, atasan, celana, hingga rok yang terbuat dari bahan kulit.",
            kemejaImageId = R.drawable.k8
        ),
        kemeja(
            id = 9,
            title = "lycra",
            material = "Male",

            description = "Jika kamu jarang mendengar kain lycra, jenis kain yang satu ini biasanya disebut juga sebagai bahan spandeks. Bahan kain yang satu ini memiliki ciri khas tingkat elastisitas yang tinggi..",
            kemejaImageId = R.drawable.k9
        ),
        kemeja(
            id = 10,
            title = "organza",
            material = "Male",

            description = "Organza atau bahan organdi memang menjadi salah satu bahan kain yang sedang naik daun. Pasalnya sekarang banyak sekali atasan, dress, hijab, hingga kebaya yang menggunakan jenis kain ini..",
            kemejaImageId = R.drawable.k10
        ),
    )
}