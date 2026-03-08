package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BellCheck: ImageVector
    get() {
        if (_BellCheck != null) {
            return _BellCheck!!
        }
        _BellCheck = ImageVector.Builder(
            name = "Filled.BellCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveToRelative(7.685f, 4.71f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.216f, -0.88f)
                lineToRelative(-2.468f, 3.417f)
                lineToRelative(-1.005f, -1.148f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.129f, 0.987f)
                lineToRelative(1.38f, 1.576f)
                curveToRelative(0.443f, 0.507f, 1.244f, 0.47f, 1.638f, -0.077f)
                close()
            }
        }.build()

        return _BellCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BellCheck: ImageVector? = null
