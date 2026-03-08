package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.SearchHome: ImageVector
    get() {
        if (_SearchHome != null) {
            return _SearchHome!!
        }
        _SearchHome = ImageVector.Builder(
            name = "Filled.SearchHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                verticalLineToRelative(-1.978f)
                lineToRelative(1.5f, -1.094f)
                lineToRelative(1.5f, 1.094f)
                verticalLineTo(13f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 0.25f)
                horizontalLineToRelative(-2.5f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 13f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.25f, 11.5f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.578f, 5.294f)
                lineToRelative(2.675f, 2.676f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-2.678f, -2.678f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, 11.5f)
                moveToRelative(10.942f, -1.466f)
                lineToRelative(-2.25f, -1.64f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.884f, 0f)
                lineToRelative(-2.25f, 1.64f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.308f, 0.606f)
                verticalLineTo(13f)
                curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(2.5f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 13f)
                verticalLineToRelative(-2.36f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.308f, -0.606f)
            }
        }.build()

        return _SearchHome!!
    }

@Suppress("ObjectPropertyName")
private var _SearchHome: ImageVector? = null
