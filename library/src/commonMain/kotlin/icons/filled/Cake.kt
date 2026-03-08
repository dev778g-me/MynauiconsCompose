package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Cake: ImageVector
    get() {
        if (_Cake != null) {
            return _Cake!!
        }
        _Cake = ImageVector.Builder(
            name = "Filled.Cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                lineTo(6.25f, 4f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3.25f)
                moveToRelative(5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                lineTo(11.25f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                lineTo(16.25f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(-10f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(11.25f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(16.25f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(3.25f)
                lineTo(18f, 10.25f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 2.73f)
                verticalLineToRelative(7.27f)
                lineTo(22f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(2f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.25f)
                lineTo(3.25f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.007f, -0.191f)
                arcTo(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 10.25f)
                horizontalLineToRelative(0.25f)
                lineTo(6.25f, 7f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6.25f)
                moveToRelative(-1f, 5.5f)
                curveToRelative(-0.56f, 0f, -1.052f, 0.396f, -1.203f, 0.917f)
                curveToRelative(0.568f, 0.549f, 1.167f, 0.675f, 1.665f, 0.522f)
                curveToRelative(0.453f, -0.14f, 0.989f, -0.559f, 1.434f, -1.439f)
                close()
                moveTo(16.12f, 11.75f)
                curveToRelative(0.408f, 0.758f, 0.922f, 1.209f, 1.397f, 1.394f)
                curveToRelative(0.525f, 0.205f, 1.126f, 0.135f, 1.699f, -0.428f)
                arcTo(1.275f, 1.275f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11.75f)
                close()
                moveTo(13.898f, 11.75f)
                horizontalLineToRelative(-3.78f)
                curveToRelative(0.546f, 1.016f, 1.276f, 1.464f, 1.86f, 1.498f)
                curveToRelative(0.558f, 0.032f, 1.32f, -0.307f, 1.92f, -1.498f)
            }
        }.build()

        return _Cake!!
    }

@Suppress("ObjectPropertyName")
private var _Cake: ImageVector? = null
