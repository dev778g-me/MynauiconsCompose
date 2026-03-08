package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Outline.Camera",
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
                moveTo(20.52f, 20.414f)
                curveToRelative(0.308f, -0.375f, 0.48f, -0.884f, 0.48f, -1.414f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.53f, -0.172f, -1.04f, -0.48f, -1.414f)
                curveTo(20.215f, 5.21f, 19.799f, 5f, 19.365f, 5f)
                horizontalLineToRelative(-8.981f)
                curveTo(8.659f, 5f, 8.325f, 3.269f, 6.827f, 3.026f)
                curveTo(6.563f, 2.983f, 6.289f, 3f, 6.022f, 3f)
                curveToRelative(-0.953f, 0f, -1.429f, 0f, -1.804f, 0.159f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.059f, 1.06f)
                curveTo(3f, 4.592f, 3f, 5.068f, 3f, 6.021f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.53f, 0.172f, 1.04f, 0.48f, 1.414f)
                curveToRelative(0.306f, 0.375f, 0.722f, 0.586f, 1.156f, 0.586f)
                horizontalLineToRelative(14.728f)
                curveToRelative(0.434f, 0f, 0.85f, -0.21f, 1.157f, -0.586f)
                moveTo(16f, 3f)
                horizontalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 17f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null
