package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TypeText: ImageVector
    get() {
        if (_TypeText != null) {
            return _TypeText!!
        }
        _TypeText = ImageVector.Builder(
            name = "Outline.TypeText",
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
                moveTo(12.53f, 20f)
                lineTo(7.764f, 4f)
                lineTo(3f, 20f)
                moveToRelative(1.596f, -5.03f)
                horizontalLineToRelative(6.337f)
                moveToRelative(4.244f, -3.03f)
                curveTo(16.765f, 10.933f, 21f, 9.925f, 21f, 13.451f)
                verticalLineTo(20f)
                moveToRelative(0f, -5.541f)
                curveToRelative(-1.588f, 0.504f, -6.353f, 0.504f, -6.353f, 3.526f)
                curveToRelative(0f, 3.023f, 4.765f, 2.015f, 6.353f, -0.504f)
            }
        }.build()

        return _TypeText!!
    }

@Suppress("ObjectPropertyName")
private var _TypeText: ImageVector? = null
