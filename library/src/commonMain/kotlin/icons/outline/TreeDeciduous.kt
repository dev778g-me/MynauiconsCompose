package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TreeDeciduous: ImageVector
    get() {
        if (_TreeDeciduous != null) {
            return _TreeDeciduous!!
        }
        _TreeDeciduous = ImageVector.Builder(
            name = "Outline.TreeDeciduous",
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
                moveTo(8.05f, 5.672f)
                curveToRelative(-2.42f, 0.144f, -2.671f, 2.004f, -2.404f, 3.387f)
                curveToRelative(0.061f, 0.32f, -0.255f, 0.637f, -0.527f, 0.807f)
                curveToRelative(-2.36f, 1.483f, 0.716f, 5.377f, 1.811f, 6.34f)
                curveToRelative(1.681f, 1.48f, 2.844f, 1.294f, 5.078f, 1.294f)
                curveToRelative(2.254f, 0f, 3.435f, 0.17f, 5.122f, -1.333f)
                curveToRelative(1.242f, -1.107f, 4.242f, -5.275f, 1.5f, -6.714f)
                curveToRelative(-0.28f, -0.147f, -0.48f, -0.535f, -0.358f, -0.83f)
                curveToRelative(0.8f, -1.948f, -0.94f, -3.044f, -2.16f, -3.42f)
                arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.275f, -0.257f)
                curveTo(14.68f, 2.09f, 13.363f, 2.96f, 12.128f, 3.912f)
                arcToRelative(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.02f)
                curveTo(9.18f, 2.31f, 8.88f, 4.036f, 8.446f, 5.36f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.396f, 0.312f)
                moveTo(12f, 17.5f)
                verticalLineTo(21f)
            }
        }.build()

        return _TreeDeciduous!!
    }

@Suppress("ObjectPropertyName")
private var _TreeDeciduous: ImageVector? = null
