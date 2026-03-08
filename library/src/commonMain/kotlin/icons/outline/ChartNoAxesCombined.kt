package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChartNoAxesCombined: ImageVector
    get() {
        if (_ChartNoAxesCombined != null) {
            return _ChartNoAxesCombined!!
        }
        _ChartNoAxesCombined = ImageVector.Builder(
            name = "Outline.ChartNoAxesCombined",
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
                moveToRelative(3f, 12.5f)
                lineToRelative(3.857f, -3.213f)
                curveToRelative(1.634f, -1.362f, 2.708f, -1.222f, 4.119f, 0.189f)
                lineToRelative(0.006f, 0.006f)
                curveToRelative(1.538f, 1.538f, 2.64f, 1.474f, 4.172f, 0.133f)
                lineTo(21f, 4.5f)
                moveTo(10f, 21f)
                verticalLineToRelative(-8f)
                moveToRelative(-5f, 8f)
                verticalLineToRelative(-6f)
                moveToRelative(14f, 6f)
                verticalLineTo(11f)
                moveToRelative(-4.5f, 10f)
                verticalLineToRelative(-7f)
            }
        }.build()

        return _ChartNoAxesCombined!!
    }

@Suppress("ObjectPropertyName")
private var _ChartNoAxesCombined: ImageVector? = null
