package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Bike: ImageVector
    get() {
        if (_Bike != null) {
            return _Bike!!
        }
        _Bike = ImageVector.Builder(
            name = "Filled.Bike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.71f, 18.25f)
                verticalLineToRelative(-3.454f)
                lineToRelative(-1.917f, -1.918f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                lineToRelative(4.42f, -4.421f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.432f, 0.017f)
                lineToRelative(1.914f, 2.005f)
                horizontalLineToRelative(1.783f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.724f, -0.31f)
                lineToRelative(-1.505f, -1.574f)
                lineToRelative(-2.989f, 2.99f)
                lineToRelative(1.504f, 1.504f)
                curveToRelative(0.187f, 0.187f, 0.293f, 0.442f, 0.293f, 0.707f)
                verticalLineToRelative(3.868f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                moveToRelative(9.039f, -13f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.5f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.151f, 19.901f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.094f, -2.465f)
                lineToRelative(0.005f, -0.186f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.5f, 0f)
                lineToRelative(0.005f, 0.186f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 21f)
                lineToRelative(0.186f, -0.005f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.465f, -1.094f)
                moveTo(9.25f, 17.25f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.5f, 0f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 0f)
            }
        }.build()

        return _Bike!!
    }

@Suppress("ObjectPropertyName")
private var _Bike: ImageVector? = null
