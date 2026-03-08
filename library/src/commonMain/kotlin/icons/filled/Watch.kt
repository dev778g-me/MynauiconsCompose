package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Watch: ImageVector
    get() {
        if (_Watch != null) {
            return _Watch!!
        }
        _Watch = ImageVector.Builder(
            name = "Filled.Watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.681f, 2.25f)
                curveToRelative(-0.673f, 0f, -1.224f, 0.237f, -1.649f, 0.634f)
                curveToRelative(-0.404f, 0.378f, -0.66f, 0.87f, -0.834f, 1.34f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.373f, 1.429f)
                lineToRelative(-0.092f, 0.504f)
                quadToRelative(-0.048f, 0.276f, -0.095f, 0.51f)
                curveTo(6.498f, 7.303f, 5.75f, 8.586f, 5.75f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.415f, 0.748f, 2.698f, 1.888f, 3.332f)
                quadToRelative(0.047f, 0.235f, 0.095f, 0.511f)
                quadToRelative(0.04f, 0.23f, 0.092f, 0.504f)
                curveToRelative(0.086f, 0.45f, 0.198f, 0.956f, 0.373f, 1.43f)
                curveToRelative(0.174f, 0.47f, 0.43f, 0.961f, 0.834f, 1.34f)
                curveToRelative(0.425f, 0.396f, 0.976f, 0.633f, 1.65f, 0.633f)
                horizontalLineToRelative(2.637f)
                curveToRelative(0.673f, 0f, 1.224f, -0.237f, 1.649f, -0.634f)
                curveToRelative(0.405f, -0.378f, 0.66f, -0.87f, 0.834f, -1.34f)
                curveToRelative(0.175f, -0.473f, 0.287f, -0.979f, 0.373f, -1.429f)
                lineToRelative(0.092f, -0.504f)
                quadToRelative(0.048f, -0.276f, 0.095f, -0.51f)
                curveToRelative(1.14f, -0.635f, 1.888f, -1.918f, 1.888f, -3.333f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.415f, -0.748f, -2.698f, -1.888f, -3.332f)
                quadToRelative(-0.047f, -0.235f, -0.095f, -0.511f)
                lineToRelative(-0.092f, -0.504f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.373f, -1.43f)
                curveToRelative(-0.174f, -0.47f, -0.43f, -0.961f, -0.834f, -1.34f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, -0.633f)
                close()
                moveTo(9.25f, 6.25f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(0.059f, -0.315f)
                curveToRelative(0.082f, -0.43f, 0.175f, -0.837f, 0.306f, -1.191f)
                curveToRelative(0.133f, -0.358f, 0.285f, -0.609f, 0.452f, -0.765f)
                curveToRelative(0.147f, -0.138f, 0.333f, -0.229f, 0.624f, -0.229f)
                horizontalLineToRelative(2.638f)
                curveToRelative(0.291f, 0f, 0.477f, 0.091f, 0.624f, 0.23f)
                curveToRelative(0.167f, 0.155f, 0.32f, 0.406f, 0.452f, 0.764f)
                curveToRelative(0.13f, 0.354f, 0.224f, 0.762f, 0.306f, 1.19f)
                quadToRelative(0.03f, 0.153f, 0.058f, 0.316f)
                close()
                moveTo(9.299f, 18.065f)
                quadToRelative(-0.03f, -0.152f, -0.058f, -0.315f)
                horizontalLineToRelative(5.519f)
                lineToRelative(-0.059f, 0.315f)
                arcToRelative(7.6f, 7.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.306f, 1.191f)
                curveToRelative(-0.133f, 0.358f, -0.285f, 0.609f, -0.452f, 0.765f)
                curveToRelative(-0.147f, 0.138f, -0.333f, 0.229f, -0.624f, 0.229f)
                lineTo(10.68f, 20.25f)
                curveToRelative(-0.291f, 0f, -0.477f, -0.091f, -0.624f, -0.23f)
                curveToRelative(-0.167f, -0.155f, -0.32f, -0.406f, -0.452f, -0.764f)
                arcToRelative(7.6f, 7.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.306f, -1.19f)
                moveTo(12.75f, 10f)
                verticalLineToRelative(2.084f)
                lineToRelative(1.25f, 0.78f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.793f, 1.272f)
                lineToRelative(-1.604f, -1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.353f, -0.636f)
                lineTo(11.25f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
            }
        }.build()

        return _Watch!!
    }

@Suppress("ObjectPropertyName")
private var _Watch: ImageVector? = null
