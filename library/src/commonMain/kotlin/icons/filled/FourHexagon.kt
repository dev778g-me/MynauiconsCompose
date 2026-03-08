package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FourHexagon: ImageVector
    get() {
        if (_FourHexagon != null) {
            return _FourHexagon!!
        }
        _FourHexagon = ImageVector.Builder(
            name = "Filled.FourHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                lineTo(2.75f, 8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(13.306f, 8.201f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.445f, -0.402f)
                curveToRelative(-0.383f, 1.378f, -1.16f, 2.67f, -1.863f, 3.634f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.185f, 1.44f)
                lineToRelative(-0.072f, 0.075f)
                lineToRelative(-0.018f, 0.018f)
                lineToRelative(-0.004f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.531f, 1.28f)
                horizontalLineToRelative(3f)
                lineTo(12.25f, 16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(13.75f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.366f)
                quadToRelative(0.159f, -0.203f, 0.326f, -0.433f)
                curveToRelative(0.755f, -1.035f, 1.645f, -2.494f, 2.096f, -4.116f)
            }
        }.build()

        return _FourHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _FourHexagon: ImageVector? = null
