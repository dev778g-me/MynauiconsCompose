package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Tablet: ImageVector
    get() {
        if (_Tablet != null) {
            return _Tablet!!
        }
        _Tablet = ImageVector.Builder(
            name = "Outline.Tablet",
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
                moveTo(17.714f, 3f)
                horizontalLineTo(6.286f)
                curveTo(5.023f, 3f, 4f, 3.806f, 4f, 4.8f)
                verticalLineToRelative(14.4f)
                curveToRelative(0f, 0.994f, 1.023f, 1.8f, 2.286f, 1.8f)
                horizontalLineToRelative(11.428f)
                curveTo(18.977f, 21f, 20f, 20.194f, 20f, 19.2f)
                verticalLineTo(4.8f)
                curveToRelative(0f, -0.994f, -1.023f, -1.8f, -2.286f, -1.8f)
                moveTo(10.5f, 6f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _Tablet!!
    }

@Suppress("ObjectPropertyName")
private var _Tablet: ImageVector? = null
