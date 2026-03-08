package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CalendarMinus: ImageVector
    get() {
        if (_CalendarMinus != null) {
            return _CalendarMinus!!
        }
        _CalendarMinus = ImageVector.Builder(
            name = "Filled.CalendarMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.301f)
                lineToRelative(-0.035f, 0.003f)
                curveToRelative(-0.71f, 0.054f, -1.309f, 0.169f, -1.856f, 0.432f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.083f, 1.97f)
                curveToRelative(-0.287f, 0.532f, -0.41f, 1.113f, -0.469f, 1.793f)
                curveToRelative(-0.057f, 0.662f, -0.057f, 1.482f, -0.057f, 2.51f)
                verticalLineToRelative(4.981f)
                curveToRelative(0f, 1.029f, 0f, 1.85f, 0.057f, 2.511f)
                curveToRelative(0.06f, 0.68f, 0.182f, 1.261f, 0.469f, 1.792f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.083f, 1.971f)
                curveToRelative(0.547f, 0.263f, 1.146f, 0.378f, 1.856f, 0.432f)
                curveToRelative(0.696f, 0.054f, 1.56f, 0.054f, 2.654f, 0.054f)
                horizontalLineToRelative(5.262f)
                curveToRelative(1.094f, 0f, 1.958f, 0f, 2.654f, -0.054f)
                curveToRelative(0.71f, -0.055f, 1.309f, -0.169f, 1.856f, -0.432f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.083f, -1.97f)
                curveToRelative(0.287f, -0.532f, 0.41f, -1.113f, 0.469f, -1.793f)
                curveToRelative(0.057f, -0.662f, 0.057f, -1.482f, 0.057f, -2.51f)
                verticalLineTo(10.01f)
                curveToRelative(0f, -1.029f, 0f, -1.85f, -0.057f, -2.511f)
                curveToRelative(-0.06f, -0.68f, -0.182f, -1.261f, -0.469f, -1.792f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.083f, -1.971f)
                curveToRelative(-0.547f, -0.263f, -1.146f, -0.378f, -1.856f, -0.432f)
                lineTo(17.25f, 3.3f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.253f)
                quadToRelative(-0.515f, -0.004f, -1.119f, -0.003f)
                horizontalLineTo(9.37f)
                quadToRelative(-0.604f, 0f, -1.119f, 0.003f)
                close()
                moveTo(5.51f, 5.088f)
                curveToRelative(0.294f, -0.142f, 0.663f, -0.232f, 1.24f, -0.282f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.247f)
                arcTo(151f, 151f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.4f, 4.75f)
                horizontalLineToRelative(5.2f)
                quadToRelative(0.639f, 0f, 1.15f, 0.003f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-0.194f)
                curveToRelative(0.577f, 0.05f, 0.946f, 0.14f, 1.24f, 0.282f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 1.33f)
                curveToRelative(0.114f, 0.212f, 0.196f, 0.466f, 0.25f, 0.832f)
                horizontalLineTo(3.846f)
                curveToRelative(0.055f, -0.366f, 0.137f, -0.62f, 0.251f, -0.831f)
                arcTo(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.51f, 5.088f)
                moveTo(10f, 13.25f)
                horizontalLineToRelative(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
            }
        }.build()

        return _CalendarMinus!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarMinus: ImageVector? = null
