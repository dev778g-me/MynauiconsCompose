package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bowl: ImageVector
    get() {
        if (_Bowl != null) {
            return _Bowl!!
        }
        _Bowl = ImageVector.Builder(
            name = "Filled.Bowl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.956f, 10.25f)
                curveToRelative(-0.94f, 0f, -1.813f, 0.778f, -1.696f, 1.83f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.812f, 5.816f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.984f, 1.524f)
                curveToRelative(0.126f, 0.073f, 0.177f, 0.184f, 0.176f, 0.268f)
                verticalLineToRelative(0.306f)
                arcToRelative(1.753f, 1.753f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.755f, 1.756f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.965f, 0f, 1.755f, -0.78f, 1.755f, -1.75f)
                verticalLineToRelative(-0.449f)
                lineToRelative(0.002f, -0.017f)
                lineToRelative(0.003f, -0.007f)
                arcToRelative(0.1f, 0.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.047f, -0.038f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.104f, -1.593f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.812f, -5.815f)
                curveToRelative(0.117f, -1.053f, -0.756f, -1.831f, -1.696f, -1.831f)
                close()
                moveTo(6f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 4.25f)
                moveToRelative(12f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(-6f, -2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
            }
        }.build()

        return _Bowl!!
    }

@Suppress("ObjectPropertyName")
private var _Bowl: ImageVector? = null
