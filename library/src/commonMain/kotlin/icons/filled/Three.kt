package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Three: ImageVector
    get() {
        if (_Three != null) {
            return _Three!!
        }
        _Three = ImageVector.Builder(
            name = "Filled.Three",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.457f, 7.011f)
                curveToRelative(0.761f, 0.54f, 1.293f, 1.38f, 1.293f, 2.482f)
                verticalLineToRelative(0.022f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 0.152f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.495f, 1.476f)
                curveToRelative(-0.193f, 0.31f, -0.45f, 0.606f, -0.785f, 0.857f)
                curveToRelative(0.335f, 0.25f, 0.592f, 0.546f, 0.786f, 0.857f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.504f, 1.628f)
                verticalLineToRelative(0.021f)
                curveToRelative(0f, 1.101f, -0.532f, 1.943f, -1.293f, 2.483f)
                curveToRelative(-0.739f, 0.523f, -1.68f, 0.761f, -2.582f, 0.761f)
                reflectiveCurveToRelative(-1.844f, -0.238f, -2.582f, -0.761f)
                curveTo(8.532f, 16.449f, 8f, 15.609f, 8f, 14.507f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                curveToRelative(0f, 0.56f, 0.25f, 0.967f, 0.66f, 1.258f)
                curveToRelative(0.434f, 0.307f, 1.054f, 0.485f, 1.715f, 0.485f)
                reflectiveCurveToRelative(1.281f, -0.178f, 1.715f, -0.485f)
                curveToRelative(0.409f, -0.29f, 0.658f, -0.694f, 0.66f, -1.252f)
                verticalLineToRelative(-0.003f)
                lineToRelative(-0.003f, -0.044f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.274f, -0.816f)
                curveToRelative(-0.245f, -0.392f, -0.776f, -0.9f, -2.098f, -0.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                curveToRelative(1.322f, 0f, 1.854f, -0.508f, 2.098f, -0.9f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.277f, -0.86f)
                verticalLineToRelative(-0.003f)
                curveToRelative(-0.002f, -0.558f, -0.251f, -0.962f, -0.66f, -1.252f)
                curveToRelative(-0.434f, -0.307f, -1.054f, -0.485f, -1.715f, -0.485f)
                reflectiveCurveToRelative(-1.281f, 0.178f, -1.715f, 0.485f)
                curveToRelative(-0.41f, 0.291f, -0.66f, 0.697f, -0.66f, 1.258f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -1.101f, 0.532f, -1.942f, 1.293f, -2.482f)
                curveToRelative(0.739f, -0.523f, 1.68f, -0.761f, 2.582f, -0.761f)
                reflectiveCurveToRelative(1.844f, 0.238f, 2.582f, 0.761f)
            }
        }.build()

        return _Three!!
    }

@Suppress("ObjectPropertyName")
private var _Three: ImageVector? = null
