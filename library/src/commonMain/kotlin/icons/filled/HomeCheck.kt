package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HomeCheck: ImageVector
    get() {
        if (_HomeCheck != null) {
            return _HomeCheck!!
        }
        _HomeCheck = ImageVector.Builder(
            name = "Filled.HomeCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.191f, 2.9f)
                lineTo(4.325f, 7.718f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.075f, 2.29f)
                verticalLineToRelative(8.802f)
                curveToRelative(0f, 1.605f, 1.273f, 2.94f, 2.883f, 2.94f)
                horizontalLineToRelative(11.734f)
                curveToRelative(1.61f, 0f, 2.883f, -1.335f, 2.883f, -2.94f)
                verticalLineToRelative(-8.802f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.075f, -2.29f)
                lineTo(13.81f, 2.9f)
                arcToRelative(2.84f, 2.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.618f, 0f)
                moveToRelative(4.573f, 7.492f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 1.047f)
                lineToRelative(-2.8f, 3.876f)
                arcToRelative(1.05f, 1.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.64f, 0.077f)
                lineToRelative(-1.378f, -1.576f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.129f, -0.987f)
                lineToRelative(1.005f, 1.148f)
                lineToRelative(2.467f, -3.416f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.047f, -0.169f)
            }
        }.build()

        return _HomeCheck!!
    }

@Suppress("ObjectPropertyName")
private var _HomeCheck: ImageVector? = null
