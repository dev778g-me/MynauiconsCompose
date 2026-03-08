package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShootingStar: ImageVector
    get() {
        if (_ShootingStar != null) {
            return _ShootingStar!!
        }
        _ShootingStar = ImageVector.Builder(
            name = "Outline.ShootingStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5.647f)
                lineTo(9.353f, 3f)
                moveToRelative(0.53f, 6.882f)
                lineTo(4.058f, 4.06f)
                moveTo(5.647f, 12f)
                lineTo(3f, 9.353f)
                moveToRelative(5.294f, 5.294f)
                lineToRelative(4.235f, -2.118f)
                lineToRelative(2.118f, -4.235f)
                lineToRelative(2.118f, 4.235f)
                lineTo(21f, 14.647f)
                lineToRelative(-4.235f, 2.118f)
                lineTo(14.647f, 21f)
                lineToRelative(-2.118f, -4.235f)
                close()
            }
        }.build()

        return _ShootingStar!!
    }

@Suppress("ObjectPropertyName")
private var _ShootingStar: ImageVector? = null
