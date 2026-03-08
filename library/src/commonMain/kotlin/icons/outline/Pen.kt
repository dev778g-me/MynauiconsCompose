package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Pen: ImageVector
    get() {
        if (_Pen != null) {
            return _Pen!!
        }
        _Pen = ImageVector.Builder(
            name = "Outline.Pen",
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
                moveToRelative(7.63f, 7.63f)
                lineToRelative(3.006f, 3.006f)
                moveTo(3.042f, 4.34f)
                lineToRelative(2.616f, 9.157f)
                curveToRelative(0.778f, 2.723f, 2.933f, 4.6f, 5.764f, 4.6f)
                arcToRelative(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.264f, -0.148f)
                curveToRelative(0.392f, -0.09f, 0.812f, -0.001f, 1.097f, 0.283f)
                lineToRelative(2.46f, 2.46f)
                curveToRelative(0.41f, 0.41f, 1.075f, 0.41f, 1.485f, 0f)
                lineToRelative(2.964f, -2.965f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.486f)
                lineToRelative(-2.455f, -2.455f)
                curveToRelative(-0.284f, -0.284f, -0.373f, -0.703f, -0.284f, -1.094f)
                quadToRelative(0.143f, -0.624f, 0.145f, -1.27f)
                curveToRelative(0f, -2.832f, -1.877f, -4.987f, -4.6f, -5.765f)
                lineTo(4.341f, 3.042f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, 1.299f)
            }
        }.build()

        return _Pen!!
    }

@Suppress("ObjectPropertyName")
private var _Pen: ImageVector? = null
