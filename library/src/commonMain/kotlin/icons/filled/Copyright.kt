package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Copyright: ImageVector
    get() {
        if (_Copyright != null) {
            return _Copyright!!
        }
        _Copyright = ImageVector.Builder(
            name = "Filled.Copyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveTo(12f, 7.25f)
                curveToRelative(-1.32f, 0f, -2.32f, 0.647f, -2.962f, 1.572f)
                curveToRelative(-0.628f, 0.902f, -0.917f, 2.06f, -0.917f, 3.178f)
                reflectiveCurveToRelative(0.29f, 2.276f, 0.917f, 3.178f)
                curveToRelative(0.643f, 0.925f, 1.642f, 1.572f, 2.962f, 1.572f)
                curveToRelative(1.208f, 0f, 1.998f, -0.548f, 2.585f, -1.28f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.17f, -0.94f)
                curveToRelative(-0.373f, 0.466f, -0.763f, 0.72f, -1.415f, 0.72f)
                curveToRelative(-0.766f, 0f, -1.33f, -0.353f, -1.73f, -0.928f)
                curveToRelative(-0.416f, -0.598f, -0.649f, -1.44f, -0.649f, -2.322f)
                reflectiveCurveToRelative(0.233f, -1.724f, 0.648f, -2.322f)
                curveToRelative(0.4f, -0.575f, 0.965f, -0.928f, 1.73f, -0.928f)
                curveToRelative(0.652f, 0f, 1.043f, 0.254f, 1.416f, 0.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, -0.94f)
                curveToRelative(-0.587f, -0.732f, -1.377f, -1.28f, -2.585f, -1.28f)
            }
        }.build()

        return _Copyright!!
    }

@Suppress("ObjectPropertyName")
private var _Copyright: ImageVector? = null
