package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Question: ImageVector
    get() {
        if (_Question != null) {
            return _Question!!
        }
        _Question = ImageVector.Builder(
            name = "Filled.Question",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(3.94f, -15.538f)
                curveToRelative(1.104f, 0.997f, 1.81f, 2.472f, 1.81f, 4.364f)
                curveToRelative(0f, 1.41f, -0.35f, 2.44f, -0.915f, 3.255f)
                curveToRelative(-0.536f, 0.775f, -1.241f, 1.315f, -1.846f, 1.777f)
                lineToRelative(-0.033f, 0.026f)
                curveToRelative(-0.639f, 0.488f, -1.167f, 0.9f, -1.558f, 1.464f)
                curveToRelative(-0.373f, 0.539f, -0.648f, 1.263f, -0.648f, 2.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.41f, 0.35f, -2.44f, 0.915f, -3.255f)
                curveToRelative(0.536f, -0.775f, 1.241f, -1.315f, 1.846f, -1.777f)
                lineToRelative(0.033f, -0.026f)
                curveToRelative(0.639f, -0.488f, 1.167f, -0.9f, 1.558f, -1.464f)
                curveToRelative(0.373f, -0.54f, 0.648f, -1.263f, 0.648f, -2.402f)
                curveToRelative(0f, -1.493f, -0.544f, -2.555f, -1.315f, -3.25f)
                curveTo(14.151f, 4.619f, 13.087f, 4.25f, 12f, 4.25f)
                reflectiveCurveToRelative(-2.151f, 0.369f, -2.935f, 1.076f)
                curveToRelative(-0.77f, 0.695f, -1.315f, 1.758f, -1.315f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.892f, 0.706f, -3.367f, 1.81f, -4.364f)
                curveTo(9.151f, 3.227f, 10.587f, 2.75f, 12f, 2.75f)
                reflectiveCurveToRelative(2.849f, 0.477f, 3.94f, 1.462f)
            }
        }.build()

        return _Question!!
    }

@Suppress("ObjectPropertyName")
private var _Question: ImageVector? = null
