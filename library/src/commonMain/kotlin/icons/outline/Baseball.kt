package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Baseball: ImageVector
    get() {
        if (_Baseball != null) {
            return _Baseball!!
        }
        _Baseball = ImageVector.Builder(
            name = "Outline.Baseball",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.804f, 9.804f)
                curveToRelative(5.022f, 0.94f, 7.697f, 5.573f, 6f, 10.392f)
                moveToRelative(10.392f, -6f)
                curveToRelative(-5.022f, -0.94f, -7.697f, -5.573f, -6f, -10.392f)
            }
        }.build()

        return _Baseball!!
    }

@Suppress("ObjectPropertyName")
private var _Baseball: ImageVector? = null
