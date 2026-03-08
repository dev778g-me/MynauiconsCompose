package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TrendingUp: ImageVector
    get() {
        if (_TrendingUp != null) {
            return _TrendingUp!!
        }
        _TrendingUp = ImageVector.Builder(
            name = "Outline.TrendingUp",
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
                moveToRelative(20f, 7f)
                lineToRelative(-5.846f, 5.938f)
                curveToRelative(-1.964f, 1.983f, -4.106f, -2.148f, -6.153f, -0.001f)
                lineTo(4f, 17f)
                moveTo(20f, 7f)
                verticalLineToRelative(7f)
                moveToRelative(0f, -7f)
                horizontalLineToRelative(-7f)
            }
        }.build()

        return _TrendingUp!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingUp: ImageVector? = null
