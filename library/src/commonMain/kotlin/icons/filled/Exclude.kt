package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Exclude: ImageVector
    get() {
        if (_Exclude != null) {
            return _Exclude!!
        }
        _Exclude = ImageVector.Builder(
            name = "Filled.Exclude",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 6f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.25f)
                horizontalLineToRelative(6.6f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.35f, 6f)
                verticalLineToRelative(1.65f)
                lineTo(18f, 7.65f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.75f)
                lineTo(21.75f, 18f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 21.75f)
                horizontalLineToRelative(-6.6f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.65f, 18f)
                verticalLineToRelative(-1.65f)
                lineTo(6f, 16.35f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.75f, -3.75f)
                close()
                moveTo(9.15f, 14.85f)
                horizontalLineToRelative(1.05f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(9.15f, 16.35f)
                lineTo(9.15f, 18f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                lineTo(18f, 20.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 18f)
                verticalLineToRelative(-6.6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9.15f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(1.05f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                lineTo(14.85f, 9.15f)
                lineTo(13.8f, 9.15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.05f)
                lineTo(14.85f, 6f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                lineTo(6f, 3.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 6f)
                verticalLineToRelative(6.6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 14.85f)
                horizontalLineToRelative(1.65f)
                lineTo(7.65f, 13.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                close()
                moveTo(10.2f, 9.15f)
                curveToRelative(-0.58f, 0f, -1.05f, 0.47f, -1.05f, 1.05f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.55f, -2.55f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                moveToRelative(5.4f, 3.9f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.55f, 2.55f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                curveToRelative(0.58f, 0f, 1.05f, -0.47f, 1.05f, -1.05f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
            }
        }.build()

        return _Exclude!!
    }

@Suppress("ObjectPropertyName")
private var _Exclude: ImageVector? = null
