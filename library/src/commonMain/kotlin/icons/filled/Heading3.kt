package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Heading3: ImageVector
    get() {
        if (_Heading3 != null) {
            return _Heading3!!
        }
        _Heading3 = ImageVector.Builder(
            name = "Filled.Heading3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(8f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(11.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.592f, 1.21f)
                lineToRelative(-2.687f, 3.461f)
                curveToRelative(0.58f, 0.145f, 1.114f, 0.391f, 1.564f, 0.752f)
                curveToRelative(0.818f, 0.655f, 1.281f, 1.63f, 1.281f, 2.838f)
                curveToRelative(0f, 0.85f, -0.268f, 1.57f, -0.738f, 2.12f)
                curveToRelative(-0.465f, 0.541f, -1.091f, 0.874f, -1.749f, 1.024f)
                curveToRelative(-1.294f, 0.294f, -2.827f, -0.095f, -3.818f, -1.187f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.11f, -1.009f)
                curveToRelative(0.6f, 0.661f, 1.568f, 0.917f, 2.375f, 0.733f)
                curveToRelative(0.394f, -0.09f, 0.719f, -0.277f, 0.943f, -0.538f)
                curveToRelative(0.219f, -0.255f, 0.377f, -0.621f, 0.377f, -1.143f)
                curveToRelative(0f, -0.794f, -0.287f, -1.322f, -0.719f, -1.668f)
                curveToRelative(-0.454f, -0.364f, -1.146f, -0.586f, -2.031f, -0.586f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.592f, -1.21f)
                lineToRelative(2.56f, -3.297f)
                horizontalLineTo(16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _Heading3!!
    }

@Suppress("ObjectPropertyName")
private var _Heading3: ImageVector? = null
