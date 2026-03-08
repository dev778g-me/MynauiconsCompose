package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Shield: ImageVector
    get() {
        if (_Shield != null) {
            return _Shield!!
        }
        _Shield = ImageVector.Builder(
            name = "Outline.Shield",
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
                moveTo(11.467f, 20.82f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.066f, 0f)
                curveTo(14.168f, 19.593f, 19f, 15.586f, 19f, 11.016f)
                verticalLineToRelative(-4.93f)
                arcToRelative(0.514f, 0.514f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.457f, -0.515f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.582f, -2.046f)
                lineToRelative(-0.61f, -0.417f)
                arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.702f, 0f)
                lineToRelative(-0.61f, 0.417f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.582f, 2.046f)
                arcToRelative(0.514f, 0.514f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.457f, 0.515f)
                verticalLineToRelative(4.93f)
                curveToRelative(0f, 4.57f, 4.832f, 8.577f, 6.467f, 9.802f)
            }
        }.build()

        return _Shield!!
    }

@Suppress("ObjectPropertyName")
private var _Shield: ImageVector? = null
