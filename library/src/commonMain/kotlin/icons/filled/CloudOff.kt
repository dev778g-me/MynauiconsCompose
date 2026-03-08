package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CloudOff: ImageVector
    get() {
        if (_CloudOff != null) {
            return _CloudOff!!
        }
        _CloudOff = ImageVector.Builder(
            name = "Filled.CloudOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.37f, 5.349f)
                curveTo(10.368f, 3.64f, 6.446f, 4.687f, 3.942f, 6.89f)
                curveTo(2.671f, 8.01f, 1.697f, 9.477f, 1.37f, 11.147f)
                curveToRelative(-0.311f, 1.581f, -0.03f, 3.285f, 1.034f, 4.952f)
                lineToRelative(0.224f, 0.333f)
                lineToRelative(0.047f, 0.06f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.22f, -0.86f)
                lineToRelative(-0.04f, -0.064f)
                lineToRelative(-0.184f, -0.272f)
                curveToRelative(-0.87f, -1.36f, -1.062f, -2.678f, -0.83f, -3.86f)
                curveToRelative(0.253f, -1.28f, 1.016f, -2.47f, 2.094f, -3.42f)
                curveTo(7.13f, 6.085f, 10.361f, 5.36f, 12.63f, 6.651f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.741f, -1.302f)
                moveToRelative(7.03f, -2.931f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.056f, 1.056f)
                lineToRelative(-0.052f, 0.056f)
                lineToRelative(-5.16f, 5.16f)
                quadToRelative(0.194f, 0.45f, 0.35f, 0.95f)
                curveToRelative(2.052f, 0.178f, 3.999f, 1.283f, 5.064f, 2.801f)
                curveToRelative(0.59f, 0.842f, 0.932f, 1.844f, 0.82f, 2.9f)
                curveToRelative(-0.107f, 0.999f, -0.608f, 1.96f, -1.524f, 2.807f)
                lineToRelative(-0.19f, 0.168f)
                curveToRelative(-1.116f, 0.957f, -2.676f, 1.184f, -3.893f, 1.184f)
                horizontalLineTo(8.026f)
                arcToRelative(6.1f, 6.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.186f, -0.405f)
                lineTo(3.405f, 21.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(18f, -18f)
                close()
            }
        }.build()

        return _CloudOff!!
    }

@Suppress("ObjectPropertyName")
private var _CloudOff: ImageVector? = null
