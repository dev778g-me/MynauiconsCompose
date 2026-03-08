package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudOff: ImageVector
    get() {
        if (_CloudOff != null) {
            return _CloudOff!!
        }
        _CloudOff = ImageVector.Builder(
            name = "Outline.CloudOff",
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
                moveToRelative(2.875f, 21f)
                lineToRelative(2.793f, -2.793f)
                moveTo(20.875f, 3f)
                lineToRelative(-5.532f, 5.532f)
                moveToRelative(0f, 0f)
                quadToRelative(0.413f, 0.803f, 0.68f, 1.831f)
                curveToRelative(4.041f, 0f, 7.933f, 4.23f, 4.255f, 7.384f)
                curveToRelative(-0.91f, 0.78f, -2.245f, 1.003f, -3.406f, 1.003f)
                horizontalLineTo(8.026f)
                curveToRelative(-0.827f, 0f, -1.632f, -0.19f, -2.358f, -0.543f)
                moveToRelative(9.675f, -9.675f)
                lineToRelative(-9.675f, 9.675f)
                moveTo(3.24f, 16f)
                curveTo(-1.307f, 9.542f, 7.728f, 3f, 13f, 6f)
            }
        }.build()

        return _CloudOff!!
    }

@Suppress("ObjectPropertyName")
private var _CloudOff: ImageVector? = null
