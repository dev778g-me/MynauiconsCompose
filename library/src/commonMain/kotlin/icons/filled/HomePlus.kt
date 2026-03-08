package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HomePlus: ImageVector
    get() {
        if (_HomePlus != null) {
            return _HomePlus!!
        }
        _HomePlus = ImageVector.Builder(
            name = "Filled.HomePlus",
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
                moveTo(12f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineTo(16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.75f)
                horizontalLineTo(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.75f)
                verticalLineTo(11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
            }
        }.build()

        return _HomePlus!!
    }

@Suppress("ObjectPropertyName")
private var _HomePlus: ImageVector? = null
