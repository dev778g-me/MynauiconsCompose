package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) {
            return _StopCircle!!
        }
        _StopCircle = ImageVector.Builder(
            name = "Filled.StopCircle",
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
                moveToRelative(8.279f, -3.198f)
                curveToRelative(-0.424f, 0.057f, -0.848f, 0.188f, -1.193f, 0.534f)
                curveToRelative(-0.346f, 0.345f, -0.477f, 0.769f, -0.534f, 1.192f)
                curveToRelative(-0.052f, 0.391f, -0.052f, 0.876f, -0.052f, 1.425f)
                verticalLineToRelative(0.094f)
                curveToRelative(0f, 0.549f, 0f, 1.034f, 0.052f, 1.425f)
                curveToRelative(0.057f, 0.423f, 0.188f, 0.847f, 0.534f, 1.192f)
                curveToRelative(0.345f, 0.346f, 0.769f, 0.477f, 1.192f, 0.534f)
                curveToRelative(0.391f, 0.052f, 0.876f, 0.052f, 1.425f, 0.052f)
                horizontalLineToRelative(0.095f)
                curveToRelative(0.548f, 0f, 1.033f, 0f, 1.424f, -0.052f)
                curveToRelative(0.423f, -0.057f, 0.847f, -0.188f, 1.192f, -0.534f)
                curveToRelative(0.346f, -0.345f, 0.477f, -0.769f, 0.534f, -1.192f)
                curveToRelative(0.052f, -0.391f, 0.052f, -0.876f, 0.052f, -1.424f)
                verticalLineToRelative(-0.095f)
                curveToRelative(0f, -0.549f, 0f, -1.034f, -0.052f, -1.424f)
                curveToRelative(-0.057f, -0.424f, -0.188f, -0.848f, -0.534f, -1.193f)
                curveToRelative(-0.345f, -0.346f, -0.769f, -0.477f, -1.192f, -0.534f)
                curveToRelative(-0.391f, -0.052f, -0.876f, -0.052f, -1.425f, -0.052f)
                horizontalLineToRelative(-0.094f)
                curveToRelative(-0.549f, 0f, -1.034f, 0f, -1.424f, 0.052f)
            }
        }.build()

        return _StopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircle: ImageVector? = null
