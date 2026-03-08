package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TelephoneOff: ImageVector
    get() {
        if (_TelephoneOff != null) {
            return _TelephoneOff!!
        }
        _TelephoneOff = ImageVector.Builder(
            name = "Filled.TelephoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.004f, 3.416f)
                curveTo(8.432f, 2.606f, 7.64f, 2.241f, 6.8f, 2.25f)
                curveToRelative(-0.797f, 0.008f, -1.573f, 0.349f, -2.221f, 0.803f)
                arcTo(6.2f, 6.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.92f, 4.79f)
                curveToRelative(-0.41f, 0.649f, -0.706f, 1.416f, -0.666f, 2.165f)
                curveToRelative(0.175f, 3.257f, 1.848f, 6.718f, 4.273f, 9.457f)
                lineTo(2.47f, 20.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(4.034f, -4.033f)
                curveToRelative(2.816f, 2.717f, 6.51f, 4.575f, 10.237f, 4.207f)
                curveToRelative(0.752f, -0.074f, 1.463f, -0.457f, 2.044f, -0.945f)
                arcToRelative(5.8f, 5.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.443f, -1.84f)
                curveToRelative(0.34f, -0.692f, 0.543f, -1.49f, 0.431f, -2.267f)
                curveToRelative(-0.116f, -0.81f, -0.569f, -1.534f, -1.402f, -2.014f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.512f, -0.31f)
                curveToRelative(-0.15f, -0.093f, -0.31f, -0.194f, -0.504f, -0.31f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.249f, -0.618f)
                curveToRelative(-0.447f, -0.163f, -0.958f, -0.27f, -1.49f, -0.197f)
                curveToRelative(-0.551f, 0.076f, -1.063f, 0.336f, -1.506f, 0.802f)
                curveToRelative(-0.341f, 0.36f, -0.843f, 0.472f, -1.549f, 0.268f)
                curveToRelative(-0.556f, -0.161f, -1.166f, -0.508f, -1.74f, -0.98f)
                lineTo(21.53f, 3.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(-9.754f, 9.753f)
                curveToRelative(-0.42f, -0.532f, -0.736f, -1.094f, -0.897f, -1.617f)
                curveToRelative(-0.224f, -0.728f, -0.125f, -1.263f, 0.225f, -1.632f)
                curveToRelative(0.473f, -0.498f, 0.725f, -1.052f, 0.778f, -1.638f)
                curveToRelative(0.052f, -0.57f, -0.09f, -1.106f, -0.293f, -1.574f)
                curveToRelative(-0.304f, -0.699f, -0.82f, -1.394f, -1.224f, -1.936f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -0.41f)
            }
        }.build()

        return _TelephoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _TelephoneOff: ImageVector? = null
