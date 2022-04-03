package com.alifnur.utsrecylerview.alifnurdata
import com.alifnur.utsrecylerview.R
import com.alifnur.utsrecylerview.alifnurmodel.Berita
//Class untuk data yang akan ditampilkan
class Datasource {
    fun loadAffirmations(): List<Berita> {
        return listOf<Berita>(
            Berita(R.string.berita1, R.drawable.image1),
            Berita(R.string.berita2, R.drawable.image2),
            Berita(R.string.berita3, R.drawable.image3),
            Berita(R.string.berita4, R.drawable.image4),
            Berita(R.string.berita5, R.drawable.image5),
            Berita(R.string.berita6, R.drawable.image6),
            Berita(R.string.berita7, R.drawable.image7),
            Berita(R.string.berita8, R.drawable.image8),
            Berita(R.string.berita9, R.drawable.image9),
            Berita(R.string.berita10, R.drawable.image10)
        )
    }
}
