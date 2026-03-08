package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CalendarOff: ImageVector
    get() {
        if (_CalendarOff != null) {
            return _CalendarOff!!
        }
        _CalendarOff = ImageVector.Builder(
            name = "Filled.CalendarOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.253f)
                quadToRelative(0.515f, -0.004f, 1.119f, -0.003f)
                horizontalLineTo(14.6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(9.4f)
                quadToRelative(-0.639f, 0f, -1.15f, 0.003f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.194f)
                curveToRelative(-0.577f, 0.05f, -0.946f, 0.14f, -1.24f, 0.282f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.33f)
                curveToRelative(-0.114f, 0.212f, -0.196f, 0.466f, -0.25f, 0.832f)
                horizontalLineTo(11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(3.755f)
                curveToRelative(-0.005f, 0.374f, -0.005f, 0.8f, -0.005f, 1.294f)
                verticalLineToRelative(4.912f)
                curveToRelative(0f, 0.833f, 0f, 1.478f, 0.025f, 2.009f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.498f, 0.07f)
                curveToRelative(-0.027f, -0.57f, -0.027f, -1.25f, -0.027f, -2.063f)
                verticalLineTo(10.01f)
                curveToRelative(0f, -1.029f, 0f, -1.85f, 0.057f, -2.511f)
                curveToRelative(0.06f, -0.68f, 0.182f, -1.261f, 0.469f, -1.792f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.083f, -1.971f)
                curveToRelative(0.547f, -0.263f, 1.146f, -0.378f, 1.856f, -0.432f)
                lineTo(6.75f, 3.3f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(12.97f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, 1.06f)
                lineToRelative(-1.107f, 1.108f)
                curveToRelative(0.317f, 0.314f, 0.588f, 0.674f, 0.801f, 1.069f)
                curveToRelative(0.287f, 0.53f, 0.41f, 1.112f, 0.469f, 1.792f)
                curveToRelative(0.057f, 0.662f, 0.057f, 1.482f, 0.057f, 2.51f)
                verticalLineToRelative(4.981f)
                curveToRelative(0f, 1.029f, 0f, 1.85f, -0.057f, 2.511f)
                curveToRelative(-0.06f, 0.68f, -0.182f, 1.261f, -0.469f, 1.792f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.083f, 1.971f)
                curveToRelative(-0.547f, 0.263f, -1.146f, 0.378f, -1.856f, 0.432f)
                curveToRelative(-0.696f, 0.054f, -1.56f, 0.054f, -2.654f, 0.054f)
                horizontalLineTo(9.37f)
                curveToRelative(-1.094f, 0f, -1.958f, 0f, -2.654f, -0.054f)
                curveToRelative(-0.71f, -0.055f, -1.309f, -0.169f, -1.856f, -0.432f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -0.392f)
                lineToRelative(-0.659f, 0.658f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                close()
            }
        }.build()

        return _CalendarOff!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarOff: ImageVector? = null
