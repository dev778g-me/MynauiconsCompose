package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DropletOff: ImageVector
    get() {
        if (_DropletOff != null) {
            return _DropletOff!!
        }
        _DropletOff = ImageVector.Builder(
            name = "Outline.DropletOff",
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
                moveTo(15.896f, 8.104f)
                lineTo(21f, 3f)
                moveToRelative(-5.104f, 5.104f)
                curveToRelative(2.355f, 2.422f, 4.5f, 4.766f, 3.03f, 8.293f)
                curveTo(17.777f, 19.163f, 14.993f, 21f, 12f, 21f)
                curveToRelative(-2.366f, 0f, -4.602f, -1.149f, -6.003f, -2.997f)
                moveToRelative(9.9f, -9.9f)
                lineToRelative(-9.9f, 9.9f)
                moveTo(3f, 21f)
                lineToRelative(2.997f, -2.997f)
                moveTo(13.509f, 5.5f)
                curveToRelative(-0.619f, -0.777f, -1.153f, -1.6f, -1.514f, -2.5f)
                curveToRelative(-1.827f, 4.58f, -8.137f, 7.15f, -7.333f, 12f)
            }
        }.build()

        return _DropletOff!!
    }

@Suppress("ObjectPropertyName")
private var _DropletOff: ImageVector? = null
