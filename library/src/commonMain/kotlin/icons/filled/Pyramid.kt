package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Pyramid: ImageVector
    get() {
        if (_Pyramid != null) {
            return _Pyramid!!
        }
        _Pyramid = ImageVector.Builder(
            name = "Filled.Pyramid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.707f, 2.043f)
                curveToRelative(0.421f, -0.128f, 0.877f, 0.035f, 1.122f, 0.4f)
                lineToRelative(8.418f, 12.562f)
                curveToRelative(0.489f, 0.73f, 0.243f, 1.7f, -0.502f, 2.128f)
                lineToRelative(-8.249f, 4.734f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.996f, 0f)
                lineToRelative(-8.245f, -4.734f)
                arcToRelative(1.493f, 1.493f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.502f, -2.128f)
                lineToRelative(8.414f, -12.56f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, -0.402f)
            }
        }.build()

        return _Pyramid!!
    }

@Suppress("ObjectPropertyName")
private var _Pyramid: ImageVector? = null
