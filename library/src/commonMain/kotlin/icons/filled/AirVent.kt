package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.AirVent: ImageVector
    get() {
        if (_AirVent != null) {
            return _AirVent!!
        }
        _AirVent = ImageVector.Builder(
            name = "Filled.AirVent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.75f, 5.654f)
                curveToRelative(0f, -1.043f, 0.861f, -1.904f, 1.904f, -1.904f)
                horizontalLineToRelative(12.692f)
                curveToRelative(1.043f, 0f, 1.904f, 0.861f, 1.904f, 1.904f)
                verticalLineToRelative(5.77f)
                arcToRelative(1.915f, 1.915f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.904f, 1.903f)
                lineTo(5.654f, 13.327f)
                arcToRelative(1.915f, 1.915f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.904f, -1.904f)
                close()
                moveTo(15.865f, 11.827f)
                verticalLineToRelative(-1.558f)
                arcToRelative(0.416f, 0.416f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.404f, -0.404f)
                lineTo(8.539f, 9.865f)
                arcToRelative(0.416f, 0.416f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.403f, 0.404f)
                verticalLineToRelative(1.558f)
                close()
                moveTo(8.538f, 14.71f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                curveToRelative(0f, 0.625f, -0.014f, 1.49f, -0.305f, 2.205f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.778f, 1.02f)
                curveToRelative(-0.388f, 0.277f, -0.86f, 0.41f, -1.397f, 0.41f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.5f)
                curveToRelative(0.283f, 0f, 0.437f, -0.067f, 0.527f, -0.131f)
                curveToRelative(0.094f, -0.067f, 0.183f, -0.177f, 0.258f, -0.363f)
                curveToRelative(0.165f, -0.406f, 0.195f, -0.984f, 0.195f, -1.64f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(3.462f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                lineTo(12.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-4.039f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(3.461f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                curveToRelative(0f, 0.657f, 0.03f, 1.235f, 0.196f, 1.641f)
                curveToRelative(0.075f, 0.186f, 0.164f, 0.296f, 0.258f, 0.363f)
                curveToRelative(0.09f, 0.064f, 0.244f, 0.131f, 0.527f, 0.131f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                curveToRelative(-0.537f, 0f, -1.01f, -0.133f, -1.397f, -0.41f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.778f, -1.02f)
                curveToRelative(-0.29f, -0.715f, -0.306f, -1.58f, -0.306f, -2.205f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
            }
        }.build()

        return _AirVent!!
    }

@Suppress("ObjectPropertyName")
private var _AirVent: ImageVector? = null
