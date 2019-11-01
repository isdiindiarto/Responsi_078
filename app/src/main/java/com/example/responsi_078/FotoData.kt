package com.example.responsi_078

object FotoData {
    private val fotoName = arrayOf(
            "Soekarno",
            "Soeharto",
            "Baharudin Yusuf Habibie",
            "Megawati Soekarno putri",
            "Susilo Bambang Yudhoyono",
            "Joko Widodo",
            "Soekarno",
            "Soeharto",
            "Baharudin Yusuf Habibie",
            "Megawati Soekarno Putri"
        )
    private val detail = arrayOf(
        "Soekarno adalah Presiden Pertama",
        "Soeharto adalah Presiden Kedua",
        "H.J Habibie adalah Presiden Ketiga",
        "Megawati adalah Presiden Keempat",
        "Susilo Bambang Yudhoyono adalah Presiden Kelima",
        "Joko Widodo adalah Presiden Keenam",
        "Soekarno adalah Presiden Pertama",
        "Soeharto adalah Presiden Kedua",
        "H.J Habibie adalah Presiden Ketiga",
        "Megawati adalah Presiden Keempat"
    )
    private val fotoPoster = intArrayOf(
        R.drawable.pr1,
        R.drawable.pr2,
        R.drawable.pr3,
        R.drawable.pr4,
        R.drawable.pr5,
        R.drawable.pr6,
        R.drawable.pr7,
        R.drawable.pr8,
        R.drawable.pr9,
        R.drawable.pr10
    )
    val listFoto: ArrayList<Foto>
        get() {
            val list = arrayListOf<Foto>()
            for (position in fotoName.indices) {
                val foto = Foto()
                foto.name = fotoName[position]
                foto.detail = detail[position]
                foto.poster = fotoPoster[position]
                list.add(foto)
            }
            return list
    }
}