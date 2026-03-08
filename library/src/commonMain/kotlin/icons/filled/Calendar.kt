package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Calendar: ImageVector
    get() {
        if (_Calendar != null) {
            return _Calendar!!
        }
        _Calendar = ImageVector.Builder(
            name = "Filled.Calendar",
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
                horizontalLineToRelative(5.262f)
                quadToRelative(0.604f, 0f, 1.119f, 0.003f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(0.301f)
                quadToRelative(0.018f, 0f, 0.035f, 0.003f)
                curveToRelative(0.71f, 0.054f, 1.309f, 0.169f, 1.856f, 0.432f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.083f, 1.97f)
                curveToRelative(0.287f, 0.532f, 0.41f, 1.113f, 0.469f, 1.793f)
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
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.083f, -1.97f)
                curveToRelative(-0.287f, -0.532f, -0.41f, -1.113f, -0.469f, -1.793f)
                curveToRelative(-0.057f, -0.662f, -0.057f, -1.482f, -0.057f, -2.51f)
                verticalLineTo(10.01f)
                curveToRelative(0f, -1.029f, 0f, -1.85f, 0.057f, -2.511f)
                curveToRelative(0.06f, -0.68f, 0.182f, -1.261f, 0.469f, -1.792f)
                arcTo(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.86f, 3.736f)
                curveToRelative(0.547f, -0.263f, 1.146f, -0.378f, 1.856f, -0.432f)
                lineTo(6.75f, 3.3f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(-0.75f, 2.556f)
                curveToRelative(-0.577f, 0.05f, -0.946f, 0.14f, -1.24f, 0.282f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.33f)
                curveToRelative(-0.114f, 0.212f, -0.196f, 0.466f, -0.25f, 0.832f)
                horizontalLineToRelative(16.309f)
                curveToRelative(-0.055f, -0.366f, -0.137f, -0.62f, -0.251f, -0.831f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.413f, -1.331f)
                curveToRelative(-0.295f, -0.142f, -0.664f, -0.232f, -1.241f, -0.282f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.247f)
                quadToRelative(-0.511f, -0.004f, -1.15f, -0.003f)
                horizontalLineTo(9.4f)
                quadToRelative(-0.639f, 0f, -1.15f, 0.003f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                close()
            }
        }.build()

        return _Calendar!!
    }

@Suppress("ObjectPropertyName")
private var _Calendar: ImageVector? = null
