package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TrendingUpDown: ImageVector
    get() {
        if (_TrendingUpDown != null) {
            return _TrendingUpDown!!
        }
        _TrendingUpDown = ImageVector.Builder(
            name = "Outline.TrendingUpDown",
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
                verticalLineToRelative(3f)
                moveToRelative(0f, -3f)
                horizontalLineToRelative(-3f)
                moveToRelative(3f, 10f)
                lineToRelative(-4.846f, -4.938f)
                moveTo(20f, 17f)
                verticalLineToRelative(-3f)
                moveToRelative(0f, 3f)
                horizontalLineToRelative(-3f)
            }
        }.build()

        return _TrendingUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingUpDown: ImageVector? = null
