package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TentTree: ImageVector
    get() {
        if (_TentTree != null) {
            return _TentTree!!
        }
        _TentTree = ImageVector.Builder(
            name = "Filled.TentTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2.75f)
                curveToRelative(0.254f, 0f, 0.512f, 0.052f, 0.752f, 0.158f)
                lineToRelative(1.553f, 0.69f)
                lineToRelative(0.068f, 0.035f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.605f, 1.363f)
                lineToRelative(-0.073f, -0.027f)
                lineToRelative(-0.945f, -0.42f)
                verticalLineTo(5.57f)
                lineToRelative(1.555f, 0.69f)
                lineToRelative(0.068f, 0.036f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.605f, 1.363f)
                lineToRelative(-0.073f, -0.027f)
                lineToRelative(-0.945f, -0.42f)
                verticalLineTo(9.06f)
                curveToRelative(1.78f, -0.969f, 3.268f, -2.103f, 4.674f, -3.79f)
                lineToRelative(0.056f, -0.061f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.096f, 0.06f)
                lineToRelative(0.361f, 0.42f)
                curveToRelative(1.301f, 1.46f, 2.685f, 2.485f, 4.313f, 3.37f)
                verticalLineTo(6.05f)
                lineToRelative(-0.945f, 0.42f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, -1.371f)
                lineToRelative(1.553f, -0.69f)
                lineToRelative(0.184f, -0.07f)
                arcToRelative(1.86f, 1.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.32f, 0.07f)
                lineToRelative(1.553f, 0.69f)
                lineToRelative(0.068f, 0.035f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.605f, 1.363f)
                lineToRelative(-0.073f, -0.027f)
                lineToRelative(-0.945f, -0.42f)
                verticalLineToRelative(3.763f)
                quadToRelative(0.273f, 0.127f, 0.555f, 0.253f)
                lineToRelative(0.096f, 0.051f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.349f, 0.634f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                lineToRelative(0.077f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.492f)
                lineTo(21f, 21.5f)
                horizontalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-9.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.445f, -0.685f)
                lineToRelative(0.508f, -0.23f)
                lineToRelative(0.024f, -0.011f)
                lineToRelative(0.023f, -0.011f)
                verticalLineToRelative(-2.6f)
                lineToRelative(-0.945f, 0.42f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, -1.371f)
                lineToRelative(1.553f, -0.69f)
                lineToRelative(0.002f, -1.023f)
                lineToRelative(-0.945f, 0.42f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, -1.371f)
                lineToRelative(1.553f, -0.69f)
                lineToRelative(0.184f, -0.07f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.75f)
                moveTo(9.2f, 20f)
                horizontalLineToRelative(5.6f)
                curveToRelative(-1.261f, -1.508f, -2.187f, -3.118f, -2.8f, -4.915f)
                curveToRelative(-0.613f, 1.797f, -1.539f, 3.407f, -2.8f, 4.915f)
            }
        }.build()

        return _TentTree!!
    }

@Suppress("ObjectPropertyName")
private var _TentTree: ImageVector? = null
