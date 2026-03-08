package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Spotify: ImageVector
    get() {
        if (_Spotify != null) {
            return _Spotify!!
        }
        _Spotify = ImageVector.Builder(
            name = "Filled.Spotify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(4.52f, -2.016f)
                curveToRelative(3.4f, -1.31f, 7.279f, -0.844f, 10.308f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.844f, -1.24f)
                curveToRelative(-3.43f, -2.336f, -7.825f, -2.87f, -11.692f, -1.38f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.54f, 1.4f)
                moveToRelative(1.3f, 3.104f)
                curveToRelative(2.515f, -0.923f, 5.275f, -0.635f, 7.372f, 0.901f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.886f, -1.21f)
                curveToRelative(-2.544f, -1.864f, -5.84f, -2.176f, -8.775f, -1.1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.517f, 1.41f)
                moveToRelative(6.292f, 3.622f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.826f, -1.252f)
                curveToRelative(-2.004f, -1.324f, -4.48f, -1.668f, -6.744f, -0.771f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.552f, 1.394f)
                curveToRelative(1.773f, -0.702f, 3.737f, -0.447f, 5.366f, 0.629f)
            }
        }.build()

        return _Spotify!!
    }

@Suppress("ObjectPropertyName")
private var _Spotify: ImageVector? = null
