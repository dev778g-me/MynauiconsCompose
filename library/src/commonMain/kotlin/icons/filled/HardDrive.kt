package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HardDrive: ImageVector
    get() {
        if (_HardDrive != null) {
            return _HardDrive!!
        }
        _HardDrive = ImageVector.Builder(
            name = "Filled.HardDrive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.24f, 2.25f)
                horizontalLineToRelative(9.52f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.462f, 1.526f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.051f, 0.135f)
                lineToRelative(2.163f, 7.846f)
                arcToRelative(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.314f, 2.325f)
                verticalLineTo(19f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21.75f)
                horizontalLineTo(5f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 19f)
                verticalLineToRelative(-4.918f)
                curveToRelative(0f, -0.785f, 0.106f, -1.567f, 0.314f, -2.325f)
                lineToRelative(2.163f, -7.846f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.051f, -0.135f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 2.25f)
                moveToRelative(13.002f, 11.5f)
                horizontalLineTo(3.758f)
                quadToRelative(-0.008f, 0.165f, -0.008f, 0.332f)
                verticalLineTo(19f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20.25f)
                horizontalLineToRelative(14f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 19f)
                verticalLineToRelative(-4.918f)
                quadToRelative(0f, -0.165f, -0.008f, -0.332f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.25f, 17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveToRelative(-4f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _HardDrive!!
    }

@Suppress("ObjectPropertyName")
private var _HardDrive: ImageVector? = null
