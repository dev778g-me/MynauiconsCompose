package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Option: ImageVector
    get() {
        if (_Option != null) {
            return _Option!!
        }
        _Option = ImageVector.Builder(
            name = "Outline.Option",
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
                moveTo(3f, 7f)
                horizontalLineToRelative(5.094f)
                curveToRelative(0.33f, 0f, 0.495f, 0f, 0.643f, 0.047f)
                quadToRelative(0.2f, 0.064f, 0.357f, 0.202f)
                curveToRelative(0.117f, 0.103f, 0.202f, 0.245f, 0.372f, 0.528f)
                lineToRelative(5.068f, 8.446f)
                curveToRelative(0.17f, 0.284f, 0.255f, 0.425f, 0.372f, 0.528f)
                quadToRelative(0.156f, 0.137f, 0.356f, 0.202f)
                curveToRelative(0.148f, 0.047f, 0.314f, 0.047f, 0.644f, 0.047f)
                horizontalLineTo(21f)
                moveTo(15f, 7f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _Option!!
    }

@Suppress("ObjectPropertyName")
private var _Option: ImageVector? = null
