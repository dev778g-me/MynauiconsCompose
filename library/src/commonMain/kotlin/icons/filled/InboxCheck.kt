package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.InboxCheck: ImageVector
    get() {
        if (_InboxCheck != null) {
            return _InboxCheck!!
        }
        _InboxCheck = ImageVector.Builder(
            name = "Filled.InboxCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.76f, 2.25f)
                horizontalLineTo(7.24f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.462f, 1.526f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.051f, 0.135f)
                lineToRelative(-2.163f, 7.846f)
                arcToRelative(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.314f, 2.325f)
                verticalLineTo(19f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21.75f)
                horizontalLineToRelative(14f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 19f)
                verticalLineToRelative(-4.918f)
                arcToRelative(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.314f, -2.325f)
                lineToRelative(-2.163f, -7.846f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.051f, -0.135f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.76f, 2.25f)
                moveToRelative(0.31f, 11.5f)
                horizontalLineToRelative(3.172f)
                quadToRelative(0.008f, 0.165f, 0.008f, 0.332f)
                verticalLineTo(19f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20.25f)
                horizontalLineTo(5f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 19f)
                verticalLineToRelative(-4.918f)
                quadToRelative(0f, -0.165f, 0.008f, -0.332f)
                horizontalLineTo(6.93f)
                curveToRelative(0.418f, 0f, 0.808f, 0.209f, 1.04f, 0.557f)
                lineToRelative(0.812f, 1.218f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.288f, 1.225f)
                horizontalLineToRelative(1.86f)
                curveToRelative(0.92f, 0f, 1.778f, -0.46f, 2.288f, -1.225f)
                lineToRelative(0.812f, -1.218f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.04f, -0.557f)
                moveToRelative(-2.678f, -6.31f)
                lineToRelative(-2.1f, 2.906f)
                arcToRelative(0.974f, 0.974f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.522f, 0.071f)
                lineTo(9.736f, 9.236f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.128f, -0.988f)
                lineToRelative(0.6f, 0.684f)
                lineToRelative(1.712f, -2.371f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.216f, 0.878f)
            }
        }.build()

        return _InboxCheck!!
    }

@Suppress("ObjectPropertyName")
private var _InboxCheck: ImageVector? = null
