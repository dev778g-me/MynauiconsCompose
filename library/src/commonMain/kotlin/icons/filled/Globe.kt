package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Filled.Globe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.06f, 9.75f)
                arcTo(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 12f)
                curveToRelative(0f, 0.78f, 0.108f, 1.535f, 0.31f, 2.25f)
                horizontalLineToRelative(3.371f)
                arcTo(21f, 21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.309f, 12f)
                curveToRelative(0f, -0.716f, 0.04f, -1.479f, 0.122f, -2.25f)
                close()
                moveTo(2.76f, 8.883f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -0.257f)
                arcToRelative(9.754f, 9.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.302f, 0.001f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 0.254f)
                curveToRelative(0.33f, 0.98f, 0.509f, 2.028f, 0.509f, 3.119f)
                curveToRelative(0f, 1.09f, -0.18f, 2.14f, -0.51f, 3.119f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.089f, 0.254f)
                arcToRelative(9.754f, 9.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.302f, 0f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, -0.256f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                curveToRelative(0f, -1.09f, 0.179f, -2.139f, 0.509f, -3.117f)
                moveTo(12f, 3.75f)
                curveToRelative(-0.428f, 0f, -0.832f, 0.192f, -1.228f, 0.624f)
                curveToRelative(-0.407f, 0.443f, -0.77f, 1.107f, -1.073f, 1.942f)
                curveToRelative(-0.215f, 0.594f, -0.39f, 1.25f, -0.525f, 1.934f)
                horizontalLineToRelative(5.652f)
                arcToRelative(13.5f, 13.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.525f, -1.934f)
                curveToRelative(-0.302f, -0.835f, -0.666f, -1.499f, -1.073f, -1.942f)
                curveToRelative(-0.396f, -0.432f, -0.8f, -0.624f, -1.228f, -0.624f)
                moveToRelative(4.57f, 10.5f)
                horizontalLineToRelative(3.37f)
                curveToRelative(0.202f, -0.715f, 0.31f, -1.47f, 0.31f, -2.25f)
                reflectiveCurveToRelative(-0.108f, -1.535f, -0.31f, -2.25f)
                horizontalLineToRelative(-3.37f)
                curveToRelative(0.082f, 0.771f, 0.121f, 1.534f, 0.121f, 2.25f)
                reflectiveCurveToRelative(-0.04f, 1.479f, -0.122f, 2.25f)
                moveToRelative(-1.744f, 1.5f)
                lineTo(9.174f, 15.75f)
                curveToRelative(0.136f, 0.683f, 0.31f, 1.34f, 0.525f, 1.934f)
                curveToRelative(0.302f, 0.835f, 0.666f, 1.499f, 1.073f, 1.942f)
                curveToRelative(0.396f, 0.432f, 0.8f, 0.624f, 1.228f, 0.624f)
                reflectiveCurveToRelative(0.832f, -0.192f, 1.228f, -0.624f)
                curveToRelative(0.407f, -0.443f, 0.771f, -1.107f, 1.073f, -1.942f)
                curveToRelative(0.215f, -0.594f, 0.39f, -1.25f, 0.525f, -1.934f)
                moveToRelative(-5.86f, 3.925f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.677f, -1.481f)
                arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.642f, -2.444f)
                lineTo(4.65f, 15.75f)
                arcToRelative(8.28f, 8.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.317f, 3.925f)
                moveTo(19.35f, 8.25f)
                arcToRelative(8.28f, 8.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.317f, -3.925f)
                curveToRelative(0.265f, 0.454f, 0.489f, 0.957f, 0.678f, 1.481f)
                curveToRelative(0.274f, 0.757f, 0.487f, 1.59f, 0.643f, 2.444f)
                close()
            }
        }.build()

        return _Globe!!
    }

@Suppress("ObjectPropertyName")
private var _Globe: ImageVector? = null
