package taskcom.android.manish.kotlinfirst

import android.support.v7.widget.DialogTitle

/**
 * Created by Manish Kumar on 11/4/2018
 */

data class Hobby(var title: String)

object DataSupplier {
    val hobbies = listOf<Hobby>(
            Hobby("Programming"),
            Hobby("Reading"),
            Hobby("Playing"),
            Hobby("Cricket"),
            Hobby("Music"),
            Hobby("Swimming"),
            Hobby("Programming"),
            Hobby("Reading"),
            Hobby("Playing"),
            Hobby("Cricket"),
            Hobby("Music"),
            Hobby("Swimming"),
            Hobby("Programming"),
            Hobby("Reading"),
            Hobby("Playing"),
            Hobby("Cricket"),
            Hobby("Music"),
            Hobby("Swimming"),
            Hobby("Programming"),
            Hobby("Reading"),
            Hobby("Playing"),
            Hobby("Cricket"),
            Hobby("Music"),
            Hobby("Swimming")
    )
}