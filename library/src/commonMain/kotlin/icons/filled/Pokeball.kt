package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pokeball: ImageVector
    get() {
        if (_Pokeball != null) {
            return _Pokeball!!
        }
        _Pokeball = ImageVector.Builder(
            name = "Filled.Pokeball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.75f, 12f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.353f, 11.25f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.293f, 0f)
                horizontalLineToRelative(7.075f)
                curveToRelative(-0.383f, -5.034f, -4.589f, -9f, -9.721f, -9f)
                curveToRelative(-5.133f, 0f, -9.339f, 3.966f, -9.722f, 9f)
                close()
                moveTo(14.646f, 12.75f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.293f, 0f)
                lineTo(2.278f, 12.75f)
                curveToRelative(0.383f, 5.034f, 4.59f, 9f, 9.722f, 9f)
                reflectiveCurveToRelative(9.339f, -3.966f, 9.721f, -9f)
                close()
            }
        }.build()

        return _Pokeball!!
    }

@Suppress("ObjectPropertyName")
private var _Pokeball: ImageVector? = null
