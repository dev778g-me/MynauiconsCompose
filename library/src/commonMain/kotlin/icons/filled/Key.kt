package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Filled.Key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 11.25f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.205f, 2.106f)
                lineToRelative(3.444f, -3.444f)
                lineToRelative(1.002f, 1.002f)
                curveToRelative(0.344f, 0.344f, 0.788f, 0.59f, 1.317f, 0.493f)
                curveToRelative(0.437f, -0.08f, 0.763f, -0.378f, 0.947f, -0.552f)
                lineToRelative(0.197f, -0.188f)
                curveToRelative(0.354f, -0.34f, 0.577f, -0.554f, 0.927f, -0.612f)
                curveToRelative(0.268f, -0.045f, 0.602f, -0.124f, 0.908f, -0.315f)
                arcToRelative(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.732f, -0.934f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.035f, -1.206f)
                curveToRelative(-0.149f, -0.368f, -0.411f, -0.698f, -0.719f, -1.005f)
                lineToRelative(-0.98f, -0.98f)
                lineTo(21.53f, 3.53f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(-9.826f, 9.825f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 11.25f)
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
