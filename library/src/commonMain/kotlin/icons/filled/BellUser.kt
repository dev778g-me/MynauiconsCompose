package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BellUser: ImageVector
    get() {
        if (_BellUser != null) {
            return _BellUser!!
        }
        _BellUser = ImageVector.Builder(
            name = "Filled.BellUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.75f, 8.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.168f, 3.73f)
                curveToRelative(1.014f, -0.971f, 2.562f, -1.48f, 4.831f, -1.48f)
                reflectiveCurveToRelative(3.818f, 0.509f, 4.832f, 1.48f)
                curveToRelative(1.008f, 0.965f, 1.352f, 2.26f, 1.508f, 3.501f)
                curveToRelative(0.075f, 0.602f, 0.11f, 1.226f, 0.144f, 1.822f)
                lineToRelative(0.003f, 0.066f)
                curveToRelative(0.036f, 0.627f, 0.07f, 1.225f, 0.147f, 1.796f)
                curveToRelative(0.153f, 1.147f, 0.458f, 2.073f, 1.138f, 2.75f)
                curveToRelative(0.588f, 0.584f, 1.028f, 1.485f, 0.975f, 2.334f)
                curveToRelative(-0.028f, 0.448f, -0.2f, 0.916f, -0.603f, 1.263f)
                curveToRelative(-0.396f, 0.342f, -0.923f, 0.488f, -1.51f, 0.488f)
                horizontalLineToRelative(-2.896f)
                curveToRelative(-0.07f, 0.813f, -0.27f, 1.654f, -0.696f, 2.36f)
                curveToRelative(-0.592f, 0.98f, -1.588f, 1.64f, -3.042f, 1.64f)
                reflectiveCurveToRelative(-2.449f, -0.66f, -3.04f, -1.64f)
                curveToRelative(-0.427f, -0.706f, -0.627f, -1.547f, -0.697f, -2.36f)
                horizontalLineTo(5.366f)
                curveToRelative(-0.596f, 0f, -1.129f, -0.148f, -1.526f, -0.497f)
                curveToRelative(-0.403f, -0.356f, -0.566f, -0.831f, -0.588f, -1.28f)
                curveToRelative(-0.04f, -0.846f, 0.405f, -1.742f, 0.976f, -2.309f)
                curveToRelative(0.68f, -0.676f, 0.985f, -1.602f, 1.138f, -2.749f)
                curveToRelative(0.076f, -0.571f, 0.111f, -1.169f, 0.146f, -1.796f)
                lineToRelative(0.004f, -0.066f)
                curveToRelative(0.034f, -0.596f, 0.069f, -1.22f, 0.144f, -1.822f)
                curveToRelative(0.156f, -1.241f, 0.5f, -2.536f, 1.508f, -3.5f)
                moveTo(12f, 5.75f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.01f, 4.627f)
                quadToRelative(-0.286f, 0.164f, -0.54f, 0.382f)
                curveToRelative(-0.734f, 0.629f, -1.2f, 1.563f, -1.2f, 2.741f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -0.752f, 0.284f, -1.266f, 0.676f, -1.603f)
                curveToRelative(0.408f, -0.35f, 0.977f, -0.543f, 1.574f, -0.543f)
                reflectiveCurveToRelative(1.166f, 0.193f, 1.574f, 0.543f)
                curveToRelative(0.392f, 0.337f, 0.676f, 0.85f, 0.676f, 1.603f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                curveToRelative(0f, -1.178f, -0.466f, -2.112f, -1.2f, -2.741f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -0.382f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.75f)
            }
        }.build()

        return _BellUser!!
    }

@Suppress("ObjectPropertyName")
private var _BellUser: ImageVector? = null
