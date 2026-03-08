package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CogTwo: ImageVector
    get() {
        if (_CogTwo != null) {
            return _CogTwo!!
        }
        _CogTwo = ImageVector.Builder(
            name = "Filled.CogTwo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.68f, 2.105f)
                lineToRelative(-6.61f, 3.8f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 8.198f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.318f, 2.292f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(6.608f, 3.799f)
                horizontalLineToRelative(0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.639f, 0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(6.608f, -3.8f)
                horizontalLineToRelative(0.003f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.25f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.318f, -2.292f)
                lineToRelative(-6.61f, -3.8f)
                lineToRelative(-0.002f, -0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.64f, 0f)
                moveTo(8.75f, 12f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 0f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, 0f)
            }
        }.build()

        return _CogTwo!!
    }

@Suppress("ObjectPropertyName")
private var _CogTwo: ImageVector? = null
