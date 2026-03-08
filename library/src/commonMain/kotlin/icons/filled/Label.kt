package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Label: ImageVector
    get() {
        if (_Label != null) {
            return _Label!!
        }
        _Label = ImageVector.Builder(
            name = "Filled.Label",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 4.025f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.025f, 2.25f)
                lineToRelative(7.488f, 0.095f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.913f, 0.807f)
                lineToRelative(7.299f, 7.298f)
                curveToRelative(0.423f, 0.423f, 0.798f, 1.034f, 0.952f, 1.687f)
                curveToRelative(0.156f, 0.664f, 0.096f, 1.476f, -0.529f, 2.1f)
                lineToRelative(-6.91f, 6.911f)
                curveToRelative(-0.625f, 0.625f, -1.437f, 0.685f, -2.101f, 0.529f)
                arcToRelative(3.66f, 3.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.687f, -0.952f)
                lineToRelative(-7.298f, -7.299f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.807f, -1.913f)
                close()
                moveTo(7.842f, 6.315f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(0.707f, 0.708f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.061f)
                close()
            }
        }.build()

        return _Label!!
    }

@Suppress("ObjectPropertyName")
private var _Label: ImageVector? = null
