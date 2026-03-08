package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ListNumber: ImageVector
    get() {
        if (_ListNumber != null) {
            return _ListNumber!!
        }
        _ListNumber = ImageVector.Builder(
            name = "Filled.ListNumber",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(11f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(11f, 16.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(6.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.068f, -0.68f)
                lineToRelative(-2f, 0.938f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.636f, 1.359f)
                lineToRelative(0.932f, -0.437f)
                verticalLineToRelative(4.445f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(4.25f, 15.281f)
                curveToRelative(0f, -0.317f, 0.29f, -0.656f, 0.75f, -0.656f)
                horizontalLineToRelative(0.04f)
                curveToRelative(0.439f, 0f, 0.71f, 0.322f, 0.71f, 0.618f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.16f, 0.444f)
                lineToRelative(-2.676f, 3.345f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 20.25f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                lineTo(5.06f, 18.75f)
                lineToRelative(1.701f, -2.126f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, -1.38f)
                curveToRelative(0f, -1.216f, -1.037f, -2.12f, -2.21f, -2.12f)
                lineTo(5f, 13.124f)
                curveToRelative(-1.196f, 0f, -2.25f, 0.921f, -2.25f, 2.157f)
                verticalLineToRelative(0.174f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _ListNumber!!
    }

@Suppress("ObjectPropertyName")
private var _ListNumber: ImageVector? = null
